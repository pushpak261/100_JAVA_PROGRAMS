
import java.util.Scanner;

class addtwono {
    public static void main(String[] args) {
        
        int a, b, c;
        System.out.println("Enter two numbers which you want to add: ");

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = a + b;
        System.out.println("Addition of Two numbers is : " +c);
    }
    
}
