/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderssender;

/**
 *
 * @author luisp
 */
public class BlockType {
    
    public final int id;
    
    public BlockType(int id)
    {
        this.id = id;
    }
    
    @Override
    public String toString()
    {
        return "P"+id;
    }
}
