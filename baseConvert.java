/*
*@Mike_Sers
*@Pat_Hennessey
*Date(01/28/19)
*CIS111B
*
* Lab_2
*Write a program that converts a decimal value (base 10) into another base, up to an including Hexadecimal (base 16).
The program will prompt the user to enter the original value to be converted and the target base. All requirements, specifications, and 
necessary information for the application are listed below.

Inputs
   Value to be converted (must be valid value in base 10 and non-negative (does not need to support points of precision...AKA decimals)
   ...if invalid prompt user again)
   The target base (up to an including base 16 or Hexadecimal)
   After each conversion is complete the program must ask if the user wishes to convert another value (if yes start over…if no exit the program)
   All inputs to be done via JOptionPane class
Outputs
   Show a meaningful output message that includes:
   The original value
   The target base
   The converted value
   All output is to be formatted clearly and shown on one JOptionPane output message box
*/

import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;

public class baseConvert
{
   public static void main(String[] args)
   {
      String stringDialogB = "";
      String convertDialogB = "";
      int inputNumber;
      int convertNumber;
      List<>
      stringDialogB = JOptionPane.showInputDialog("Please Enter a number for conversion: ");
      inputNumber = Integer.parseInt(stringDialogB);
      convertDialogB  = JOptionPane.showInputDialog("What Base would you like to convert to: ");
      convertNumber = Integer.parseInt(convertDialogB);
      
      //System.out.println(convertNumber);
      //System.out.println(inputNumber);
      
      double test = inputNumber % convertNumber;
      System.out.println(test); //output is remainder ^^ 
      
      
      // Get input
      //
      //
      //
      //
      
      //modulus % = 0 for no remainder
      
   }
    
}