/*
 write a program that print the 12 time table
 */

import java.util.Scanner;

public class TimeTable {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int number;
        int value = 0;

        System.out.print("Please enter a number: ");
        number = sc.nextInt();

        //output
        System.out.printf("%d * %d= %d\n", number, value, (number * value));
        System.out.printf("%d * %d= %d\n", number, ++value, (number * value));
        System.out.printf("%d * %d= %d\n", number, ++value, (number * value));
        System.out.printf("%d * %d= %d\n", number, ++value, (number * value));
        System.out.printf("%d * %d= %d\n", number, ++value, (number * value));
        System.out.printf("%d * %d= %d\n", number, ++value, (number * value));
        System.out.printf("%d * %d= %d\n", number, ++value, (number * value));
        System.out.printf("%d * %d= %d\n", number, ++value, (number * value));
        System.out.printf("%d * %d= %d\n", number, ++value, (number * value));
        System.out.printf("%d * %d= %d\n", number, ++value, (number * value));
        System.out.printf("%d * %d= %d\n", number, ++value, (number * value));
        System.out.printf("%d * %d= %d\n", number, ++value, (number * value));
        System.out.printf("%d * %d= %d\n", number, ++value, (number * value));
    }
}
