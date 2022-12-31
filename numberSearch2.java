import java.util.Scanner;

public class numberSearch2 {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int i, n, search, array[];

        System.out.println("Enter number of elements");
        n = in.nextInt();
        array = new int[n];

        System.out.println("Enter those " + n + " elements");

        for (i = 0; i < n; i++)
            array[i] = in.nextInt();

        System.out.println("Enter value to find");
        search = in.nextInt();

        for (i = 0; i < n; i++)
        {
            if (array[i] == search)     /* Searching element is present */
            {
                System.out.println(search + " is present at location " + (i + 1) + ".");
                break;
            }
        }
        if (i == n)  /* Element to search isn't present */
            System.out.println(search + " isn't present in array.");
    }
}

