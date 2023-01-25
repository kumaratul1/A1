public class Method_3 {
    static void rec(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum +=i;

        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        rec(7);


    }
}
