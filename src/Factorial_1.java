import java.util.Scanner;
public class Factorial_1 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int n = SC.nextInt();
        int factorial =1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;

        }
        System.out.println("The factorial of given number is ");
        System.out.println(factorial);
    }
}