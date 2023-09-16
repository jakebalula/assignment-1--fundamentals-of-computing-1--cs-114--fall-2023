// Import libraries here
// Jacob Balula
import java.util.Scanner;
public class Assignment1 {
  public static void main(String[] args) {
    // Add your code here
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
    String number;
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter a number in Farenheit:"); //Asks the user to enter a temp.
      number = scan.nextLine();
      System.out.println(number); //Prints out users response
      final float Conversion = 5.0 / 9.0; // sets the conversion factor in order to get celsius
      double celsiusTemp;
      int finaltemp;
      finaltemp = number * Conversion;
      System.out.println(number + "in celsius is" + finaltemp);


  }
}
