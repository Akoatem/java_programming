/*
  This program determined is a user input is a digit
 */

import java.util.Scanner;

public class digit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Please enter a num: ");
        num = sc.nextInt();

        switch (num){
            case 0: System.out.println(num + "is a digit");
            break;
            case 1: System.out.println(num + "is a digit");
            break;
            case 2: System.out.println(num + "is a digit");
            break;
            case 3: System.out.println(num + "is a digit");
            break;
            case 4: System.out.println(num + "is a digit");
            break;
            case 5: System.out.println(num + "is a digit");
            default:
                System.out.println(num + "is invalid");
        }

    }
}
