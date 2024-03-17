
import java.util.Scanner;                 //These lines import the Scanner class from the java.util package and the BigInteger class from the java.math package. 
import java.math.BigInteger;             //The Scanner class is used to take user input, and the BigInteger class is used to perform arithmetic operations on large numbers.

class bigintegeradd {
    public static void main(String[] args) {           //This line declares two String variables: num1 and num2. These variables will be used to store the input numbers as strings.

        String num1, num2;
        Scanner sc = new Scanner(System.in);                         //Here, you create a Scanner object named sc to read input from the console (System.in). Then, you use the nextLine() method of the Scanner class to read two lines of input provided by the user and store them in the num1 and num2 variables as strings.

        System.out.println("Enter first large number :");
        num1 = sc.nextLine();

        System.out.println("Enter second large number :");
        num2 = sc.nextLine();

        BigInteger first = new BigInteger(num1);                       //These lines create BigInteger objects named first and second by parsing the input strings num1 and num2, respectively, as integers
        BigInteger second = new BigInteger(num2);
        BigInteger sum;

        sum = first.add(second);                                    //This line adds the BigInteger objects first and second using the add method of the BigInteger class and stores the result in a new BigInteger object sum.

        System.out.println("Result of addition is "  + sum );

    }
    
}




/*
 This program converts two large numbers into BigInteger objects and performs addition using the BigInteger class, 
 and then prints the result. It's a useful example of handling large numbers in Java.
 */