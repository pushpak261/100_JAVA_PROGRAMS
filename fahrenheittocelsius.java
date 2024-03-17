
import java.util.*;           //This line imports all classes from the java.util package, which includes the Scanner class that we'll use to take user input.

class fahrenheittocelsius {       //Declaring the fahrenheittocelsius class:
    public static void main(String[] args) {     //Defining the main method

        float temp;                                                     //This line declares a variable temp of type float, which will store the temperature entered by the user.
        System.out.println("Enter the temperature in Fahrenheit ");
        Scanner sc = new Scanner(System.in);                             //Here, you create a Scanner object named sc to read input from the console (System.in)
        temp = sc.nextInt();                                             //Then, you use the nextInt() method of the Scanner class to read an integer input provided by the user and store it in the temp variable.
        temp = ((temp - 32)*5)/9;                                      //This line calculates the temperature in Celsius using the formula (Fahrenheit - 32) * 5/9 and stores the result back in the temp variable.

        System.out.println("Temperature in Celsius is " + temp);

        sc.close();


        
        

    }
    
}
