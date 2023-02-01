/*
Given a sorted array of distinct integers and a target value,
 return the index if the target is found. If not,
 return the index where it would be if it were inserted in order.
 */
/*
Given a sorted array arr[] consisting of N distinct integers and an integer K,
the task is to find the index of K,
if it’s present in the array arr[]. Otherwise,
find the index where K must be inserted to keep the array sorted.
 */

import java.io.*;
public class arraySearchSorted {
    // Function to find insert position of K
    static int find_index(int[] arr, int n, int K)
    {

        // Traverse the array
        for(int i = 0; i < n; i++)

            // If K is found
            if (arr[i] == K)
                return i;

                // If current array element
                // exceeds K
            else if (arr[i] > K)
                return i;

        // If all elements are smaller
        // than K
        return n;
    }

    // Driver Code
    public static void main(String[] args)
    {
        int[] arr = { 1, 3, 5, 6 };
        int n = arr.length;
        int K = 2;

        System.out.println(find_index(arr, n, K));
    }
}
