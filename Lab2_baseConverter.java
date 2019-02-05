/*

Author(s): @Mike_Sers, @Pat_Hennessey

Date: Feb 04, 2019

Project: Lab2_baseConverter for CIS111B

*/

import java.util.*;  // imports the entirety of the util package.
import javax.swing.*;   // imports the entirety of the swing package. 

public class Lab2_baseConverter    //   title of the program.
    
    {
   
      public static void main(String[] args) // main method.
         
         {
           
            purpose();  // calls the purpose method.
     
         }
         
      public static void purpose()  // the purpose method.
      
         {
         
            int startingNumber = 0; // initializing users input variable. This is the first number that the user will input. This is the number is in base 10.
            
            int convertingNumber = 0; // initializing targetBase variable. This is the second number that the user will input. This is the new base that the starting number will be converted to.
            
            do // do while loop that handles input validation for the first number.
               
               {
               
               String startingNumberInput = JOptionPane.showInputDialog(null,"What non-negative whole number, in base 10, do you want to convert?");  // dialog box that asks the user to input the base 10 number and holds the number as a string.
               
                  if(startingNumberInput.equals(""))  // comparing empty strings(no input). If the user does not enter a value it will recall the purpose method.
                  
                        {
                        
                        purpose();  // recalls purpose() to reprompt startingNumberInput. 
                        
                        }
               
               startingNumber = Integer.parseInt(startingNumberInput);  // converts the inputted string to a integer.
               
               if (startingNumber == 0)   // checks to see if the input is equal to zero.
             
               {
               
                  JOptionPane.showMessageDialog(null, "0 will always be 0, no matter what base it is in."); // If the user inputs zero, they will get this message. 0 will always be zero, so there really isn't a need to continue and ask what the new base they want to convert zero to.
                  
                  convertMore(); // calls the convert more method.
                                   
               }
               
               } while (startingNumber < 0);
         
            do // do while loop for input validation for the second number.
               
               {
               
               String convertingNumberInput = JOptionPane.showInputDialog(null,"Please enter a positive whole number, between 2 and 16, to use as the new base.");  // dialog box that asks the user to input the new base to convert startingNumberInput into.
               
               convertingNumber = Integer.parseInt(convertingNumberInput); // reads in users targetBase int Integer.
               
               } while (convertingNumber < 2 || convertingNumber > 16); // will repromt user with dialogBox.
            
            calculator(startingNumber, convertingNumber); // passing our new int startingNumber & int convertingNumber to be called into calculator().
         
         }
         
      public static void calculator(int x, int y)  // calculator method. Handles the math and the output for the program.
      
         {

         ArrayList<String> printArrayList = new ArrayList<>(); // ArrayList for printing the array with converted Integers back into Strings
         
         ArrayList<Integer> convertingArrayList = new ArrayList<>(); // ArrayList for storing the remainder from calculator, then 
         
         ///////////////
         /// variable declaration
         ///////////////
         
         int unchangingX = x; //inital value (startingNumber)
         
         int unchangingY = y; //inital targetBase (convertingNumber)
         
         int remainder= 0; // for convertingArrayList.add(remainder)
         
         int z = 0; // quotient of integer division
         
         ///////////////
         /// end of variable decl
         ///////////////
         
         
         ///////////////
         /// do-while
         ///////////////
         do 
            {
            
            z = (x / y); // Quotient from integer division
            
            remainder = (x % y); // Remainder from integer division
            
            convertingArrayList.add(remainder); // storing remainder into convertArray 
                        
            x = z; // reassinging z to x for next itteration of division (until condition is met)
            
            } while (x != 0);
         ///////////////
         ///end do-while
         ///////////////         
            
         //////////// 
         ///convertingArray(int) to printArray(strings)
         ///hexdeci handling by stringcomparison (.equals)
         ///set and get for array element swaping
         ////////////
         
            for (int i = 0; i < convertingArrayList.size(); i++) //reads in arrayList and compares characters greater than 10 and converts to corresponding letter
            {
               
               printArrayList.add(String.valueOf(convertingArrayList.get(i))); //in order to compare we must set each value from convertingArray (int) to printArray(string)
               
               //////////////////
               
               // the next series of if and else if statements determine if the remainders are equal to or larger than 10. Since bases 11-15 use the letters a, b, c, d, e, and f we needed to convert them to those letters for our output.
               
               // for example, 10 is equal to a, 11 is b, 12 is c, etc. 
               
               //////////////////
               
               if((printArrayList.get(i)).equals("10"))
               {
                 
                 printArrayList.set(i, "a");                      
                  
               }
               else if((printArrayList.get(i)).equals("11"))
               {
                 
                 printArrayList.set(i, "b");                      
                  
               }
               else if((printArrayList.get(i)).equals("12"))
               {
                 
                 printArrayList.set(i, "c");                      
                  
               }
               else if((printArrayList.get(i)).equals("13"))
               {
                 
                 printArrayList.set(i, "d");                      
                  
               }
               else if((printArrayList.get(i)).equals("14"))
               {
                 
                 printArrayList.set(i, "e");                      
                  
               }
               else if((printArrayList.get(i)).equals("15"))
               {
                 
                 printArrayList.set(i, "f");                      
                  
               }
               
             
            }
                        
            Collections.reverse(printArrayList);   // reverses the order of the printArrayList.
            
            String a = ""; // creates a new string to handle the output.
            
            for(int j = 0; j < printArrayList.size(); j++)  // for loop to add in the entire arrayList as one individual string.
            {
               
               a = "" + a +printArrayList.get(j);
                  
            }
            
            JOptionPane.showMessageDialog(null, "The number " + unchangingX + " in base 10, is equal to " + a + " in base " + unchangingY + ".");  // output that displays the original number, the new base, and the number converted to that base.

         convertMore(); // calls the convertMore method.
         
         System.exit(0);   // exits the program.
         
         }
         
      public static void convertMore() // the convertMore method.
      
         {
            
            String question = JOptionPane.showInputDialog(null,"Do you want to convert another number?" +   // dialog box that asks the user to input Y or anything else if they want to convert more numbers.
                                             "\n" + "Enter Y for Yes." +
                                             "\n" + "Pressing Enter or inputting anything else will close the program.");
                                             
            if (question.equalsIgnoreCase("Y")) // if statement that calls the purpose method if the input is "Y".
            
               {
               
               purpose();  // calls the purpose method.
               
               }
               
            else  //else statement that exits the program if the input is anything else than "Y".
            
               {
               
               System.exit(0);   // exits the program.
               
               }  
            
         }
         
    }