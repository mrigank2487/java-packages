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
import Pack1.Area;
import Pack2.Circumference;
import java.util.Scanner;
public class Circle 
{
    public static void main(String args[])
    {
        Scanner Sc= new Scanner(System.in);
        Area A= new Area();
        Circumference C= new Circumference();
        
        System.out.println("Enter Radius: ");
        float radius=Sc.nextFloat();
        
        float area=A.CalculateArea(radius);
        float circumference=C.CalculateCircumference(radius);
        
        System.out.println("Area is: "+area);
        System.out.println("Circumference is: "+circumference);
    }
}
