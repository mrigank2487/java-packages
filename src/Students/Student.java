/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Students;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Sandeep
 */
public class Student 
{
    private String name;
    private int RollNo;
    public void getdata()
    {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter name: ");
        name=Sc.nextLine();
        System.out.println("Enter Roll Number: ");
        RollNo=Sc.nextInt();
    }
    
    public void displaydata()
    {
        System.out.println();
        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+RollNo);
    }
}


