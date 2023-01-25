public class Array_1 {
    public static void main(String[] args) {
        float sum=0;
        float[]arr = new float[5];
         arr[0]=47.1f;
         arr[1]=98.1f;
        arr[2]=92.5f;
        arr[3]=75.7f;
        arr[4]=78.801f;
        for(int i= 0;i<arr.length;i++) {
            sum = sum + arr[i];
        }
            System.out.println(sum);

    }
}
