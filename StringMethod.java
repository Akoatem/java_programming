/**
 * write a function that return a string to the main method
 * A string method always return the string
 */

public class StringMethod {
    public static void main(String args[]) {
        System.out.println("My names are " + returnMyName()+ "," + returnMyMessage());  // print out the return string name

    }

    public static String returnMyName() {
        // this method will return a value
        // this method will not be expecting a parameter when it is called
        String myName = "Ako Atem Sampson";
        return myName;   //return statement

    }

    public static String returnMyMessage() {
            // this method will return a value
            // this method will not be expecting a parameter when it is called
            String myMessage = "I will be travelling soon";
            return myMessage;

        }
    }
