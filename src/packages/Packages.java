/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package packages;

/**
 *
 * @author Sandeep
 */
import MyPack.SecondPack;
import MyPack.FirstPack;
public class Packages 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        FirstPack fp=new FirstPack();
        fp.display();
        SecondPack sp=new SecondPack();
        sp.display();
    }
    
}
