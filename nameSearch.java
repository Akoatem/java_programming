import java.util.Scanner;

/*
 write a program to search student's names and the father's names via linear search
 */
public class nameSearch {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        String name[] = new String[5];
        String father[] = new String[5];

        int i = 0;
        int found = -1;   // this use because not the end of string
        String str = "";
        //int size = name.length;
        System.out.println("Please enter names");
        for (i = 0; i < name.length; i++){
            name[i] = sc.nextLine();
            System.out.println("Please enter father name");
            for(i = 0; i < father.length; i++) {
                father[i] = sc.nextLine();
            }

            System.out.println("ENTER NAMES TO BE SEARCHED");
            str = sc.nextLine();

            for (i = 0; i < name.length; i++){
                if (str.equalsIgnoreCase(name[i])){
                    found = i;
                    break;
                }

            }if(found == -1){
                System.out.println(str + "  is NOT found");

            }else {
                System.out.println("SEARCH SUCCESSFUL");
                System.out.println("Name" +name[found]);
                System.out.println("Father" +father[found]);

            }
        }
    }
}
