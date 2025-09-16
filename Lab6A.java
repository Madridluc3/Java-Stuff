// Your Name
// CSIS 10A (#Section Number)
// Unit 6 Lab B

/*** EXAMINE ***
The Scanner class has already been provided for user input.
*/
import java.util.Scanner;

public class Lab6A {

    
  public static void main(String[] args) {
    /*** EXAMINE ***
    A Scanner variable has already been provided for user input.
    */
    Scanner kin = new Scanner(System.in);
    

    /*** PART 1: ***
    // Declare and initialize a char variable with the value 'S' and print it.
    char myChar = 'A'; // Modify 
    System.out.println("PART 1: The value of myChar is " + myChar);
    //*/

    /*** PART 2: ***
    // Read a char from the keyboard and print it back out.         
    Scanner keyboard = new Scanner(System.in);        
    System.out.print("PART 2: Enter a character: ");        
    char inputChar = 0; // Modify to read user char input        
    System.out.println("You entered: " + inputChar);
    //*/

    /*** PART 3: ***
    // Declare and initialize a String variable with your name and print it.
    String myName = "John";  // Modify        
    System.out.println("PART 3: My name is " + myName);  
    //*/
    
    /*** PART 4: ***
    // Use charAt to extract the fourth character from a String and print it. 
    String word = "Example";        
    char extractedChar = word.charAt(1); // Modify:         
    System.out.println("PART 4: The fourth letter in " + word + " is: " + extractedChar);
    //*/

    /*** PART 5: ***
    // Determine how many letters are in a String and print the result.  
    String text = "Hello, World!";       
    int length = 0; // Modify       
    System.out.println("PART 5: The length of the string is " + length);
    //*/

    /*** PART 6: ***
    // Extract the last letter of a String using charAt and print it.   
    String word2 = "Java";   
    char lastLetter = word2.charAt(word2.length()); // Modify  
    System.out.println("PART 6: The last letter is " + lastLetter);
    //*/

    /*** PART 7: ***
    // Use toUpperCase to print a string in all caps.
    String lowerCaseText = "this is in lowercase";
    String upperCaseText = lowerCaseText; // Modify 
    System.out.println("PART 7: Uppercase Text: " + upperCaseText);
    //*/

    /*** PART 8: ***
    // Extract the first four letters of a 10-letter String using substring. 
    String longText = "abcdefghij";
    String firstFourLetters = longText.substring(1, 4); // Modify
    System.out.println("PART 8: First four letters: " + firstFourLetters);
    //*/

    /*** PART 9: ***
    // Extract the last four letters of a 10-letter String using substring. 
    String longText2 = "klmnopqrst"; 
    String lastFourLetters = longText2.substring(4); // Modify 
    System.out.println("PART 9: Last four letters: " + lastFourLetters);
    //*/

    /*** PART 10: ***
    // Combine results from PART 1, PART 6, and PART 9 into a new String. 
    String combinedResult = ""; // Modify    
    System.out.println("PART 10: Combined Result: " + combinedResult);
    //*/

    /*** PART 11: ***
    // Use equals to determine if two Strings are the same. 
    String str1 = "Hello"; 
    String str2 = "World";  
    boolean areEqual = true; // Modify to use equals  
    System.out.println("PART 11: Are the strings equal? " + areEqual);
    //*/

    /*** PART 12: ***
    // Use compareTo to determine which String comes first 
    // in alphabetical order    
    String strA = "Apple";   
    String strB = "Banana";  
    int comparisonResult = 0; // Modify  
    System.out.println("PART 12: Comparison result: " + comparisonResult); 
    if (comparisonResult < 0)  
    {  
        System.out.println(strA + " comes before " + strB );
    }
    //*/
        
    }
}