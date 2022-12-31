/*
 write a program to search a number via linear or sequential search
 https://www.javatpoint.com/java-continue
 */

import java.util.Scanner;

public class linear_sequential_search {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num[] = {12, 34,54, 58, 30, 200, 302, 460};
        int searchValue;
        int i;
        int size;
        boolean found = false;

        System.out.print("Please enter a value to be searched: ");
        searchValue = sc.nextInt();

        size = num.length;
        for(i = 0; i < size; i++){
            if (num[i] == searchValue){
                found = true;
                break;
            }
        }if (found){
            System.out.println(searchValue + " the number is found");
        }else{
            System.out.println(searchValue + " the number is NOT found");
        }
    }
}
