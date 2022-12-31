import java.util.Scanner;

/*
 determine if a user input is a digit - good fall through
 */
public class digitFall {
    public  static void main(String args[]){

        int num;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        num = sc.nextInt();

        switch (num){
            case 0 :
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
            case 6 :
            case 7 : System.out.println(num + "is a digit");
            break;
            default: System.out.println(num + "is out of range");

        }

    }
}
