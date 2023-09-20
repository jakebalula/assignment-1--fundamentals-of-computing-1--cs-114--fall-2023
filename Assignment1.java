// Jacob Balula
import java.util.Random;
import java.util.Scanner;
public class Assignment1 {
  public static void main(String[] args) {
    Double number;
    String reverse;
    int num1;

    System.out.println(); //Space added to make it look better on run
    //Series of println to make block letters
    System.out.println("   JJJJJJJJJJJJJJJ     BBBBBBBBBB");
    System.out.println("   JJJJJJJJJJJJJJJ     BBBBBBBBBBBB");
    System.out.println("           JJJJ        BBBB     BBB");
    System.out.println("           JJJJ        BBBB     BBBB");
    System.out.println("           JJJJ        BBBB     BBB");
    System.out.println("           JJJJ        BBBBBBBBBB");
    System.out.println("           JJJJ        BBBB     BBB");
    System.out.println("   JJ      JJJJ        BBBB     BBBB");
    System.out.println("    JJJ    JJJJ        BBBB     BBB");
    System.out.println("     JJJJJJJJJJ        BBBBBBBBBBBB");
    System.out.println("      JJJJJJJ          BBBBBBBBBB");
    System.out.println(); //Space added to make it look better on run

    Scanner scan = new Scanner(System.in); //sets up scanner for user input
    System.out.println("Please enter a number in Fahrenheit:"); //Asks the user to enter a temp.
    number = scan.nextDouble();
    Double celsius = (5.0 / 9.0) * (number - 32); // Converts users input to celsius

    System.out.println("Please enter a 5-character string");
    reverse = scan.next().substring(1 , 4); //Removes first and last letter of users input
    String change1 = new StringBuilder(reverse).reverse().toString(); //Reverses the string
                  

    Random generator = new Random(); //Starting random number generator
    num1 = generator.nextInt(16384) + 32; //Picks number starting from 32 - 16384
    System.out.println("Generating random number...");
        
    System.out.println(celsius + change1 + num1); //Prints out results from Temp. converter, Reverse string, and random number.

    scan.close();

  }
}
