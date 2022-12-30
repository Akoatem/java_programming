import java.util.Scanner;

/*
 This program compute the volume of a cylinder
 */
public class cylinder {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double PI = 3.14;
        double height;
        double raduis;
        double volume;

        System.out.print("Please enter height: ");
        height = sc.nextDouble();

        System.out.print("Please enter radius: ");
        raduis = sc.nextDouble();

        volume = PI * raduis * raduis * height;
        System.out.printf("The volume is: %.2f", volume);

    }
}
