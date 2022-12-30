/*
Calculate the average percentage class marks of students

 */


import java.util.Scanner;

public class average {
    public static void main(String args[]){
        float mark, average;
        float sum = 0.0f;
        int count = 0;    // numbers of terms

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a mark(-1 to quit): ");
        mark = sc.nextFloat();   // primary read
        while (mark != -1){
            count++;
            sum += mark;
            System.out.print("Enter a mark(-1 to quit): ");
            mark = sc.nextFloat();   // secondary read
        }
        average = sum / count;
        System.out.printf("The average mark is %.2f\n", average);

    }
}
