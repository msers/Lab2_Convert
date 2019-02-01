import javax.swing.*;   // imports the entirety of swing into the program. If avaliable I just use .* in case I need to use somehting else within the package.

public class Lab2Testing_CIS111B_2    //   title of the program. Since this is the file I do testing in for the labs I just use LavXTesting. I also have all of my CIS111A stuff on my pc still, so I add _CIS111B so I don't resave over my old code.
    
    {
   
      public static void main(String[] args) // main method.
         
         {
            
            //////
            
            // variable declaration
            
            //////
            
            
            
            int startingNumber;
            
            int convertingNumber;
            
            int[] inputNumbers = new int[2];
            
            //////
            
            // end of variable declaration
            
            //////
            
            
            purpose();  // call to the purpose method. This method holds most of the code for the purpose of the project.     
              
         }
         
      public static int purpose()
      
         {
         
         inputs();
         
         System.out.println(inputNumbers);
         
         }
         
      public static int[] inputs(int startingNumber, int convertingNumber) //  the purpose method
      
         {
      
             String startingNumberInput = JOptionPane.showInputDialog(null,"What non-negative whole number, in base 10, do you want to convert?");  // dialog box that asks the user to input the base 10 number and holds the number as a string.
             
             if (startingNumberInput.equals(""))
             
               {
               
               purpose();
               
               }
             
             int startingNumber = Integer.parseInt(startingNumberInput);   // converts the string startingNumberInput into an integer.
             
             inputNumbers[0] = startingNumber;
             
             
             if (startingNumber == 0)
             
               {
               
                  JOptionPane.showMessageDialog(null, "0 will always be 0, no matter what base it is in.");
                  
                  //convertMore();
               
               }
               
            if (startingNumber < 0)
            
               {
               
                  JOptionPane.showMessageDialog(null, "The number " + startingNumber + " is negative. Please enter a new non-negative whole number on the following text box.");
                  
                  purpose();
               
               }
              
             String convertingNumberInput = JOptionPane.showInputDialog(null,"What base do you want to convert " + startingNumberInput + " to?");  // dialog box that asks the user to input the new base to convert startingNumberInput into.
             
             int convertingNumber = Integer.parseInt(convertingNumberInput);  // converts the string convertingNumberInput into an integer.
             
             inputNumbers[1] = convertingNumber;
             
             return inputNumbers;
             
             //return convertingNumber;
             
         }
         
   }