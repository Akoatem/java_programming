/*
 write a program that store the names and telephone numbers of 20 students and search accordingly.
 Enter their names and telephone then search them
 */

import java.util.Scanner;

public class storeNameSearch {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        String n;
        int k = 0;   // k is used for indicator
        int a = 0;
        String b = "";
        String name[] = new String[20];
        long number[] = new long[20];

        for (int i = 0; i < 20; i++){
            System.out.print("Enter names one by one\n");
            name[i] = sc.next();
            System.out.print("Enter telephone numbers\n");
            number[i] = sc.nextLong();
        }
        System.out.println("Enter name to be searched\n");
        n = sc.next();
        for (int i = 0; i < 20; i++){
            if(name[i].equals(n)){
             k = 1;
             a = i;
             b = name[i];
            }
        }
        if(k == 1){
            System.out.println("The name is " + b + " and the telephone number is " +number[a]);
        }else {
            System.out.println("Name Not found");
        }
    }
}
