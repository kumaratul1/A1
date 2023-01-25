public class Array_3 {
    public static void main(String[] args) {
        int[]marks ={78,67,89,45,98,93,85};
        int sum=0;
        for(int element:marks) {
            sum = (sum + element);
        }
        System.out.println(sum/marks.length);

        }

    }

