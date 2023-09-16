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
      Double number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number in Farenheit:"); //Asks the user to enter a temp.
            number = scan.nextDouble();
            System.out.println(number); //Prints out users response
            Double celsius = (5.0 / 9.0) * (number - 32);
          System.out.println(number + " in celsius is " + celsius);


  }
}
