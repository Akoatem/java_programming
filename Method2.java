import java.util.Scanner;

/**
 * write a jave program that call a method from another class
 */
public class Method2 {
    public static void main(String argd[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the year");
        theYear(sc.nextInt()); // calling the year method in the main method
    }
    public static void theYear(int x){
        int year = 0;  // initializing the year variable
        year = x;  // give the year value of x
        System.out.println("The year is:" +year);
    }
}
