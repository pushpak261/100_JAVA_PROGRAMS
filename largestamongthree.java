
import java.util.Scanner;

class largestamongthree{
    public static void main(String args[]) {

        int x, y, z;
        System.out.println("Enter three numbers : ");
        
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        if ( x > y && x > z )
            System.out.println("The largest among three is : " +x);
        else if ( y > x && y > z )
            System.out.println("The largest among three is : " +y);
        else if ( z > x && z > y )
            System.out.println("The largest among three is : " +z);
        else
            System.out.println("Please enter correct numbers. ");
            
              

    }
}