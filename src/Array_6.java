public class Array_6 {
    public static void main(String[] args) {
        int[]arr={1,2,3,455,5,6,87};
        int max= Integer.MIN_VALUE;
        for(int element:arr)
        {
            if(element>max)
            {
                max=element;
            }

        }
        System.out.println("the largest number is : "+max);
    }
}
