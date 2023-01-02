/*
 write a program that print the list of menu is various items
 */


import java.util.Scanner;

public class Menu {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double num1, num2, ans;
        int choice;

        do{
            System.out.println("Welcome To Our Menu, kindly select from the choices");
            System.out.println("=====================================================");
            System.out.println("1.  Addition");
            System.out.println("2.  Subtraction");
            System.out.println("3.  Multiplication");
            System.out.println("4.  Division");
            System.out.println("5.  Exit");
            System.out.print("Please enter choice: ");
            choice = sc.nextInt();

            switch (choice){
                case 1 : System.out.print("Enter first number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextInt();
                    ans = num1 + num2;
                    System.out.printf("The ans is %d + %d= %d\n", num1,num2,ans);
                    break;
                case  2 : System.out.print("Enter first number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextInt();
                    ans = num1 - num2;
                    System.out.printf("The ans is %d - %d= %d\n", num1,num2,ans);
                    break;
                case 3 : System.out.print("Enter first number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextInt();
                    ans = num1 * num2;
                    System.out.printf("The ans is %d * %d= %d\n", num1,num2,ans);
                    break;
                case 4 : System.out.print("Enter first number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextFloat();
                    ans = num1 / num2;
                    System.out.printf("The ans is %d / %d= %d\n", num1,num2,ans);
                    break;
                case 5 : System.out.println("Exiting.....Goodbye");
                default: System.out.println("Invalid request");
            }
        }while (choice != 5);
    }
}
