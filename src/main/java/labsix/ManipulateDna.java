package labsix;
/**
//DNA sequence.
//Chyennee Collins October 13,2017
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class ManipulateDna {
  /**
   *changing the Dna sequences.
   *Chnaging the Dna into an Rna sequence
  */
  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Chyennee Collins " + new Date());
    // declare the starting file and scanner
    File dnaInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      dnaInputsFile = new File("input/dna_inputs.txt");
      scanner = new Scanner(dnaInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // Step One: Read in and display the chosen DNA string
    String dna = scanner.nextLine();
    System.out.println("Okay, I am going to manipulate the Dna string 'Actg'.");
    System.out.println("\nEnter a string containing only C, G,T, and A: actg");
    // Step Two: Compute the complement of the DNA String
    String s1 = dna.replace('a','T');
    String s2 = s1.replace('t','A');
    String s3 = s2.replace('g','C');
    String comp = s3.replace('c','G');
    System.out.println("Complement of ACTG is: " + comp);
    // Step Three: Insert a randomly chosen DNA letter into the DNA String
    // Generating a random, then adding in the random letter at the end of the dna
    Random mutation = new Random();
    int num1 = mutation.nextInt(4);
    int num2 = mutation.nextInt(3);
    char insertion = "ATGC".charAt(num1);
    char letter = "ATGC".charAt(num2);
    String intMut = insertion + dna;
    System.out.println("Adding in " + insertion + " at position 0 gives " + intMut);
    
    // Step Four: Delete a DNA letter from a randomly chosen position in the DNA string
    String one = dna.substring(0, num1);
    String two = dna.substring(num1 + 1, dna.length());
    System.out.println("Deleting from position: " + num1 + " gives " + one + two);

    // Step Five: Change a random position in the DNA String to a randomly chosen DNA letter
    String three = dna.substring(0,num1);
    String four = dna.substring(num1 + 1, dna.length());
    System.out.println("Changing position " + (num1 + 1) + " gives " + one + letter + two);
    // Step Six: Display a final thankyou message
    System.out.println("\nThanks for using the ManipulateDna program.");
    System.out.println("Have an awesome day");
  }

}
