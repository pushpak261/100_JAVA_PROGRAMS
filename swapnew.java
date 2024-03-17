
//Swapping without using temporary variable


import java.util.Scanner;

class swapnew{
    public static void main(String args[]) {   //This is the entry point of the program. It's a special method in Java that serves as the starting point for execution.

        int x, y;                                  //This line declares two integer variables: x and y. These variables will be used to store the values of the two numbers to swap.
        System.out.println("Enter a and b : ");
        Scanner sc = new Scanner(System.in);                       //Here, you create a Scanner object named sc to read input from the console (System.in). Then, you use the nextInt() method of the Scanner class to read integer inputs provided by the user and store them in the x and y variables.

        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("Before Swapping : \nx = "+x+"\ny = "+y);

        x = x + y;                                                              //This block of code swaps the values of x and y without using a temporary variable. It's done using arithmetic operations: addition, subtraction, and assignment.
        y = x - y;
        x = x - y;

        System.out.println("After Swapping : \nx = "+x+"\ny = "+y);
    }
}