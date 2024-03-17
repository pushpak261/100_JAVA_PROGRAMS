import java.util.Scanner;                    //This line imports the Scanner class from the java.util package, which is used to take user input.

class swap{                                     //You define a class named swap.
    public static void main(String args[]) {       //This is the entry point of the program. It's a special method in Java that serves as the starting point for execution.    
        int x, y, temp;                               //This line declares three integer variables: x, y, and temp. These variables will be used to store the values of the two numbers to swap (x and y), as well as for temporary storage during the swapping process.
        
        System.out.println("Enter x and y ");           //This line prints a message to the console, asking the user to enter the values of x and y.
        Scanner sc = new Scanner(System.in);            // Here, you create a Scanner object named sc to read input from the console (System.in). Then, you use the nextInt() method of the Scanner class to read integer inputs provided by the user and store them in the x and y variables.
        
        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("Before Swapping :\nx = "+x+"\ny = "+y);

        temp = x;                                                                           //Swapping the values of x and y using a temporary variable:
        x = y;
        y = temp;

        System.out.println("After Swapping :\nx = "+x+"\ny = "+y);
    }
}