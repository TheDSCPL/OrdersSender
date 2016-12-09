package orderssender;

import com.sun.jmx.remote.util.OrderClassLoaders;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class UDP {
    
    //SINGLETON STUFF
    private static final UDP INSTANCE = new UDP();  //calls the constructor
    
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        super.clone();
        throw new CloneNotSupportedException();
    }
    
    public static final String DEFAULT_ADDRESS = "127.0.0.1";
    public static final int DEFAULT_PORT = 54321;
    
    private static DatagramSocket socket;
    
    private UDP()
    {
        setServerURL(DEFAULT_ADDRESS);
        setPort(DEFAULT_PORT);
        try {
            socket = new DatagramSocket();
        } catch (SocketException ex) {
            OrdersSender.showError("Error creating socket!");
            socket = null;
        }
    }
    
    private static InetAddress serverURL;
    private static int port;
    private static String serverURLString = DEFAULT_ADDRESS;
    
    public static int getPort() {
        return port;
    }

    public static void setPort(int _port) {
        if(_port < 1001 || _port > 65535)
        {
            OrdersSender.showError("Port must be between 1001 and 65535");
            return;
        }
        port = _port;
    }

    public static String getServerURL() {
        if(serverURL == null)
            return null;
        return serverURL.getHostAddress();
    }

    public static void setServerURL(String _serverURL) {
        serverURLString = _serverURL;
        try {
            serverURL = InetAddress.getByName(DEFAULT_ADDRESS);
        } catch (UnknownHostException ex) {
            OrdersSender.showError("\"" + _serverURL + "\" is an unknown host!");
            serverURL = null;
        }
    }
    
    public static void close()
    {
        socket.close();
        socket = null;
    }
    
    public static void send(String toSend)
    {
        try {
            if (serverURL == null) {
                OrdersSender.showError("Can't send orders to an invalid server address");
                return;
            }

            socket.send(new DatagramPacket(toSend.getBytes(), toSend.length(), serverURL, port));
        }
        catch (IOException ex) {
            OrdersSender.showError("Error sending the order");
            return;
        } catch (Exception ex) {
            OrdersSender.showError("An unknown error occurred while sending");
        }
    }
    
    public enum Orders {
        TRANSFORMATION ('T'),
        ASSEMBLY ('M'),
        UNLOAD ('U');
        Orders(char c)
        {
            this.c = c;
        }
        public final char c;
    }
    
    public static void sendOrder(Orders transformation, int p1, int p2, int n)
    {
        if(n < 0 || n > 99)
        {
            OrdersSender.showWarning("Order quantity outside of bounds ([0,99])");
            return;
        }
        String command = String.format(":%1$c%2$03d%3$1d%4$1d%5$02d", transformation.c, OrdersSender.getOrderID(), p1, p2, n);
        OrdersSender.showInfo("Command " + command);
        send(command);
        OrdersSender.incrementOrderID();
    }
}
