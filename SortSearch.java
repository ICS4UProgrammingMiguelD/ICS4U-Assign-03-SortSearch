import java.io.*;
import java.util.Random;
import java.util.Scanner;
/**.
* Generates a list of random values and then sorts them. 

* @author  Miguel Duarte
* @version 1.0
* @since   2020-10-28
*/
public class SortSearch {
  
  public static void main(String[] args) {
    
    // Create an array with 250 random numbers
    int[] randomNumArray = generaterandomnumbers();
    
    // Read the number to find in the array from the user
    
    // Create input file
    File inputFile = new File("./input.txt");
    FileWriter myWriter = new FileWriter("./input.txt");.
    
    for (int i = 0; i < randomNumArray.length; i++) {
      String tempString = String.valueOf(randomNumArray[i]);
      output += tempString + " ";
    }
    writetotxt(output);
    
    BubbleSort ob = new BubbleSort(); 
    ob.bubbleSort(randomNumArray); 
    System.out.println("Sorted array"); 
    ob.printArray(randomNumArray); 
  }
  
  /**.
   * Function: GnerateRandomNumbers
   * Input: None
   * Output: An array of 250 random numbers
   * This function creates an array that is 250 cells
   * long and populates it with random numbers. It then
   * returns the array.
  */
  public static int[] generaterandomnumbers() {
    
    // Create random object
    Random randomNum  = new Random();
    
    // Create an array with a length of 250
    int[] randomNumArray = new int[250];
    
    // create writer object
    
    // Populate the array with random numbers
    for (int index = 0; index < 250; index++) {
      
      // Obtain a number between [1 - 99]
      int computerNumber = randomNum.nextInt(100);
      
      // Put the random number into the array at the index
      randomNumArray[index] = computerNumber;
      // System.out.println(randomNumArray[index]);
    }
    return randomNumArray;
  }
  
  /**.
   * 
  */
  public static int[] bubblesort() {
    
    int n = randomNumArray.length;
    for (int i = 0; i < n - 1; i++)
      for (int j = 0; j < n - i - 1; j++)
        if (randomNumArray[j] > randomNumArray[j + 1]) {
          
          //Swap
          int temp = randomNumArray[j];
          randomNumArray[j] = randomNumArray[j + 1];
          randomNumArray[j + 1] = temp;
        }
  }
  
  /**.
   * 
  */
  void printArray(int arr[]) {
    int n = randomNumArray.length;
    for (int i = 0; i < n; ++1)
      System.out.print(randomNumArray[i] + " ");
    System.out.println();
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