import java.util.Scanner;
public class Factorial_2 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int n= SC.nextInt();
        int factorial=1;
        int i=1;
        while(i<=n){
            factorial*=i;
            i++;
        }
        System.out.println("Factorial of given number is :");
        System.out.println(factorial);
    }
}
