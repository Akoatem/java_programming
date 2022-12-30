/*
 This program compute percentage class mark
 */
import java.util.Scanner;

public class averagePercentage {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        final  int PASS_MARK = 50;
        final  int DISTINCTION = 75;

        int mark;
        int sumPass = 0;
        int numberPass = 0;
        float averagePass;
        System.out.print("Please enter mark(-1 to quit): ");
        mark = sc.nextInt();   // primary entry
        while (mark != -1){
            if (mark >= PASS_MARK){
                sumPass += mark;
                numberPass++;

            }
            System.out.print("Please enter mark(-1 to quit): ");
            mark = sc.nextInt();   // secondary entry
        }
        averagePass = (float)sumPass / numberPass;
        System.out.printf("The average is %% pass: %.2f\n", averagePass);

    }
}
