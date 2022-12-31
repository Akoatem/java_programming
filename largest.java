/*
  write a program to determine the largest number of a user input
 */

import java.util.Scanner;

public class largest {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        int x, y, z;
        //int num = 0;
        System.out.print("Please enter a number: ");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

       if (x > y && x > z){
            System.out.println(x + " is the largest number");
        } else if (y > x && y > z) {
            System.out.println(y + " is the largest number");

        }else {
            System.out.println(z + " is the largest number");
        }
       /* switch (num){
            case 1: System.out.println(x + " is the largest number");
            break;
            case 2 : System.out.println(y + " is the largest number");
            break;
            case 3 : System.out.println(z + " is the largest number");
            //default: System.out.println(" invalid number");
        }*/
    }
}
