import java.io.*;
import java.util.Random;
import java.util.Scanner;
/**.
* Generates a list of random values and then sorts them. 

* @author  Miguel Duarte
* @version 1.0
* @since   2020-10-22
*/
public class SortSearch {
  public static void main(String[] args) {
    
    String output = "";
    int[] randomNumArray = generaterandomnumbers();
    for (int i = 0; i < randomNumArray.length; i++) {
      String tempString = String.valueOf(randomNumArray[i]);
      output += tempString + "\r\n";
    }
    writetotxt(output);
  }
  
  /**.
   * 
  */
  public static int[] generaterandomnumbers() {
    
    // Randomly generate 250 values
    Random randomNum  = new Random();
    
    int[] randomNumArray = new int[250];
    
    for (int index = 0; index < 250; index++) {
      
      // Obtain a number between [1 - 99]
      int computerNumber = randomNum.nextInt(100);
      
      randomNumArray[index] = computerNumber;
      System.out.println(randomNumArray[index]);
    }
    return randomNumArray;
  }
  
  /**.
   * 
  */
  public static void writetotxt(String output) {
    
    // File name
    String fileName = "output.txt";
    
    try {
      // Creating the file
      File myObj = new File(fileName);
      
      // Creating the file writer
      FileWriter fileWriter = new FileWriter(myObj);
      
      // Creating the buffered writer
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
      
      // Writing to the text file
      bufferedWriter.write(output);
      
      // Closing the buffered writer
      bufferedWriter.close();
      
    } catch(Exception e) {
    }
  }
}