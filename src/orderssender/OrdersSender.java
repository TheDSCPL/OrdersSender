/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderssender;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import orderssender.UI.*;

public class OrdersSender {

    public static final MainFrame mainFrame = new MainFrame();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*UDP.send(":M0002101");
        UDP.send(":M0015601");*/
    }
    
    private static int orderID = 0;
    
    public static int getOrderID()
    {
        return orderID;
    }
    
    public static int incrementOrderID()
    {
        setOrderID(getOrderID() + 1);
        return orderID;
    }
    
    public static int setOrderID(int orderID)
    {
        if(orderID < 0 || orderID > 999)
        {
            OrdersSender.showWarning("Order ID overflow (999)! Starting new count (0).");
            orderID = 0;
        }
        OrdersSender.orderID = orderID;
        mainFrame.mainPanel.nextOrderIDTextField.setText("" + OrdersSender.getOrderID());
        return orderID;
    }
    
    /**
     * Show a pop-up with an info icon and the specified message.
     *
     * @param message
     */
    public static void showInfo(String message) {
        runOnUI(() -> {
            JOptionPane.showMessageDialog(mainFrame, message, "Info", INFORMATION_MESSAGE);
        });
    }

    /**
     * Show a pop-up with a warning icon and the specified message.
     *
     * @param message
     */
    public static void showWarning(String message) {
        runOnUI(() -> {
            JOptionPane.showMessageDialog(mainFrame, message, "Warning", WARNING_MESSAGE);
        });
    }

    /**
     * Show a pop-up with an error icon and the specified message.
     *
     * @param message
     */
    public static void showError(String message) {
        runOnUI(() -> {
            JOptionPane.showMessageDialog(mainFrame, message, "Error", ERROR_MESSAGE);
        });
    }
    
    /**
     * Run a Runnable object on the interface thread
     *
     * @param r The runnable to run
     */
    public static void runOnUI(Runnable r) {
        java.awt.EventQueue.invokeLater(r);
    }
    
}
