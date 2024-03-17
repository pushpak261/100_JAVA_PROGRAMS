import java.util.Scanner;

public class fiboseries {
      public static void main(String[] args) {

        System.out.println("Enter number to get Fibonacci Series : ");

        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();

        System.out.print("\n");

        int num1 = 0;
        int num2 = 1;

        System.out.print(num1+"\n"+ num2+"\n");

        for (int i = 3; i<=temp; i++) {
           
            int nextnumber = num1 + num2;
            System.out.println(+nextnumber);
            num1 = num2;
            num2 = nextnumber;
        }


      }
}