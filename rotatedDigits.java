/*
Given two integers N and K,
the task is to rotate the digits of N by K.
If K is a positive integer, left rotate its digits.
Otherwise, right rotate its digits
 */

public class rotatedDigits {
    public static void main(String args[]) {

        int K = 10;
        int N = 27373;


        // Function Call
        countFunction.rotateNumberByK(N, K);

    }
}
class countFunction {
    // Function to find the count of
    // digits in N

    static int numberOfDigit(int N) {
        // Stores count of
        // digits in N
        int digit = 0;
        // Calculate the count
        // of digits in N
        while (N > 0) {
            // Update digit
            digit++;
            // Update N
            N /= 10;
        }
        return digit;
    }


// Function to rotate the digits of N by K
static void rotateNumberByK(int N, int K){
    // Stores count of digits in N
        int X = numberOfDigit(N);
    // Update K so that only need to
    // handle left rotation
    K = ((K % X) + X) % X;

    // Stores first K digits of N
    int left_no = N / (int)(Math.pow(10, X - K));

    // Remove first K digits of N
    N = N % (int)(Math.pow(10, X - K));

    // Stores count of digits in left_no
    int left_digit = numberOfDigit(left_no);

    // Append left_no to the right of
    // digits of N
    N = (N * (int)(Math.pow(10, left_digit))) + left_no;

    System.out.println(N);
}

}



