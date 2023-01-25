import java.util.Scanner;
public class Method_1 {
    static void table(int n){
        for(int i=1;i<=10;i++){
            System.out.format("%d X %d=%d \n",n,i,n*i);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the value :");
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        table(n);


    }
}