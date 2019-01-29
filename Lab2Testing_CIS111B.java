/*

This code mostly does what is needed to do for the project, however there are a couple issues:

"String convertedNumber = Double.toString(startingNumber, convertingNumber);" apparently does not work while "String convertedNumber = Integer.toString(startingNumber, convertingNumber);" does.

I believe that Krause wants us to figure out how do the math in our program instead of using Integer.toString. 

So while we can still use a good bit of the code here, we need to figure out how to do the math for any number into any base up to base 16.

I think we can do this with a loop of some kind but I am not sure how we are going to handle decimals.

*/


import javax.swing.*;   // imports the entirety of swing into the program. If avaliable I just use .* in case I need to use somehting else within the package.

public class Lab2Testing_CIS111B    //   title of the program. Since this is the file I do testing in for the labs I just use LavXTesting. I also have all of my CIS111A stuff on my pc still, so I add _CIS111B so I don't resave over my old code.
    
    {
   
      public static void main(String[] args) // main method.
         
         {
            
            purpose();  // call to the purpose method. This method holds most of the code for the purpose of the project.     
              
         }
         
      public static void purpose() //  the purpose method
      
         {
      
             String startingNumberInput = JOptionPane.showInputDialog(null,"What number, in base 10, do you want to convert?");  // dialog box that asks the user to input the base 10 number and holds the number as a string.
              
             String convertingNumberInput = JOptionPane.showInputDialog(null,"What base do you want to convert " + startingNumberInput + " to?");  // dialog box that asks the user to input the new base to convert startingNumberInput into.
           
             int startingNumber = Integer.parseInt(startingNumberInput);   // converts the string startingNumberInput into an integer.
           
             int convertingNumber = Integer.parseInt(convertingNumberInput);  // converts the string convertingNumberInput into an integer.
           
             String convertedNumber = Integer.toString(startingNumber, convertingNumber); // string that uses the Integer.toString method to convert startingNumber into the number in the new base.
           
             JOptionPane.showMessageDialog(null, startingNumberInput + " is " + convertedNumber + " in base " + convertingNumberInput + ".");   // output dialog that states the number in base 10, the new number, and the base it was transormed into.
             
             convertMore();   // calls the convertMore method.
   
      
         }
         
         /*
         
         public static void purpose() //  the purpose method. ****** THIS ONE HAS EVERYTHING CONVERTED TO DOUBLES. String convertedNumber = Double.toString(startingNumber, convertingNumber); DOES NOT WORK PROPERLY.  ****** 
      
         {
      
             String startingNumberInput = JOptionPane.showInputDialog(null,"What number, in base 10, do you want to convert?");  // dialog box that asks the user to input the base 10 number and holds the number as a string.
              
             String convertingNumberInput = JOptionPane.showInputDialog(null,"What base do you want to convert " + startingNumberInput + " to?");  // dialog box that asks the user to input the new base to convert startingNumberInput into.
           
             double startingNumber = Double.parseDouble(startingNumberInput);   // converts the string startingNumberInput into an integer.
           
             double convertingNumber = Double.parseDouble(convertingNumberInput);  // converts the string convertingNumberInput into an integer.
           
             String convertedNumber = Double.toString(startingNumber, convertingNumber); // string that uses the Integer.toString method to convert startingNumber into the number in the new base.
           
             JOptionPane.showMessageDialog(null, startingNumberInput + " is " + convertedNumber + " in base " + convertingNumberInput + ".");   // output dialog that states the number in base 10, the new number, and the base it was transormed into.
             
             /* Logic/Math for purpose()
             
                Create a (do-while?) loop that:
                
                        a.)terminates the loop once the product = 0 (or the number no longer can divide into it... meaning 0)
                        b.)saves product of targetBaseNumber (xx.00) AND saves the remainder as well (00.xx)
                        c.)Once targetBaseNumber is divided by our givenNumInBaseTen we need to save that product (just the int) and use it on the next iteration of division (can be saved in a temp variable)
                        d.)save the remainder (using % division) for that will be used to store in a ArrayList<> that we can create another simple for loop to display its contents
                        
                        do-while loops allow the code to exec one last time when the remainder is = 0
                           
                           //within do-while loop
                           do
                           {
                              *math conversion (ideas)
                              
                              (int targetBaseNumber / int givenNumInBaseTen) = (whateverIntProduct) We just need the integer without points of percision xx.00
                              we can now store whateverIntProduct into a temp variable for the next itteration of division
                              
                              
                              (int targetBaseNumber % int givenNumInBaseTen) = (remainderOfTargetBase)
                              the remainderOfTargetBase will we the test condition for the loop once it equals 0 (!= 0)
                              
                              Assuming we use an ArrayList<>(x) we can create an infintly large array to store each remainder
                              ArrayList.add(remainderOfTargetBase)
                              
                              We can access each element in the array and perform the needed number to letter conversion(or if no conversion is needed)
                              
                           } while(remainderofTargetBase != 0)
 
             */
             
             convertMore();   // calls the convertMore method.
   
      
         }
         
         */
         
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
