import java.util.Scanner;
public class Reverse_order_Mul {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Please enter the number :");
        int n = Sc.nextInt();
        for (int i=10;i>=1;i--)
        {
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
    }
}
