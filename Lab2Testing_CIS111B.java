/*

This code mostly does what is needed to do for the project, however there are a couple issues:

"String convertedNumber = Double.toString(startingNumber, convertingNumber);" apparently does not work while "String convertedNumber = Integer.toString(startingNumber, convertingNumber);" does.

I believe that Krause wants us to figure out how do the math in our program instead of using Integer.toString. 

So while we can still use a good bit of the code here, we need to figure out how to do the math for any number into any base up to base 16.

I think we can do this with a loop of some kind but I am not sure how we are going to handle decimals.

*/


import javax.swing.*;   // imports the entirety of swing into the program. If avaliable I just use .* in case I need to use somehting else within the package.

public class Lab2Testing_CIS111B_2    //   title of the program. Since this is the file I do testing in for the labs I just use LavXTesting. I also have all of my CIS111A stuff on my pc still, so I add _CIS111B so I don't resave over my old code.
    
    {
   
      public static void main(String[] args) // main method.
         
         {
            
           
            purpose(); 
  
              
         }
         
      public static void purpose()
      
         {
         
            int startingNumber = 0;
            
            int convertingNumber = 0;
            
            do
               
               {
               
               String startingNumberInput = JOptionPane.showInputDialog(null,"What non-negative whole number, in base 10, do you want to convert?");  // dialog box that asks the user to input the base 10 number and holds the number as a string.
               
                  if(startingNumberInput.equals("")) 
                  
                        {
                        
                        purpose();
                        
                  
                        }
               
               startingNumber = Integer.parseInt(startingNumberInput);
               
               if (startingNumber == 0)
             
               {
               
                  JOptionPane.showMessageDialog(null, "0 will always be 0, no matter what base it is in.");
                  
                  convertMore();
                  
                  
               }
               
               } while (startingNumber < 0);
         
            
            do
               
               {
               
               String convertingNumberInput = JOptionPane.showInputDialog(null,"Please enter a positive whole number between 2 and 16 to use as the new base?");  // dialog box that asks the user to input the new base to convert startingNumberInput into.
               
               convertingNumber = Integer.parseInt(convertingNumberInput);
               
               } while (convertingNumber < 2 || convertingNumber > 16);
            
            calculator(startingNumber, convertingNumber);
         
         }
         
      public static void calculator(int x, int y)
      
         {
         
         int unchangingX = x;
         
         System.out.println(x + " " + y);
         
         System.exit(0);
         /*
         
         Things to add:
            
            >  Modulous Division finding r
            
            >  Regular Division finding z
            
            >  Loop to hold the remainder (r)
            
               > arrayList
            
            >  Loop to hold the new quotient (z)
            
            >  Way to make x be the new z
            
            
         
         
         */
         
         }
         
      public static void convertMore() // the convertMore method.
      
         {
            
            String question = JOptionPane.showInputDialog(null,"Do you want to convert another number?" +   // dialog box that asks the user to input Y or anything else if they want to convert more numbers.
                                             "\n" + "Enter Y for Yes." +
                                             "\n" + "Pressing Enter or inputting anything else will close the program.");
                                             
            if (question.equalsIgnoreCase("Y")) // if statement that calls the purpose method if the input is "Y".
            
               {
               
               purpose();
               
               }
               
            else  //else statement that exits the program if the input is anything else than "Y".
            
               {
               
               System.exit(0);
               
               }  
            
         }
         
    }
