
/**
 * write a function that add two interger and return the result to the main method
 */

import java.util.Scanner;

public class MethodDemo4 {
    public static void mian(String args []){
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        System.out.print("Please enter a number: ");
        num1 = sc.nextInt();

        System.out.print("Please enter a number: ");
        num2 = sc.nextInt();
        // output
        System.out.println("The result is " +Add(num1,num2)+ "," +returnMyMessage());

    }
    public static int Add(int x, int y){
        // this function takes 2 values
        int result = 0;
        result = x + y;
        return result;
    }
    public static String returnMyMessage(){
        String myMessage = " this is very good result";
        return myMessage;
    }
}

