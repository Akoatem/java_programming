/*
 write a programe to determine if a number is even or odd number
 */

import java.util.Scanner;

public class even_odd_number {
    public static void main(String args[]){

        int num;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        num = sc.nextInt();

        if((num % 2 == 0)){
            System.out.println(num + " is an even number");
        }else {
            System.out.println(num + " is an odd number");
        }
    }
}
