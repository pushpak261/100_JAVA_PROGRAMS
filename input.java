
import java.util.Scanner;                    //This line imports the Scanner class from the java.util package, allowing us to use it in our code to read input from the user.

class input{                                  //Here, you're defining a class named input. In Java, class names conventionally start with a capital letter.
    public static void main(String args[]){         
        int a;
        float b;                                              //These lines declare three variables:
        String s;

        System.out.println("Enter string name : ");
        
        Scanner sc = new Scanner(System.in);                 //Here, you're creating a Scanner object named sc to read input from the standard input stream (System.in), which is typically the keyboard.

        String name = sc.nextLine();                       //This line reads a line of text entered by the user and stores it in the name variable as a String.

        System.out.println("Hello, " + name + "!");

        sc.close();                                        //Finally, this line closes the Scanner object sc to release system resources associated with it.
    }
}