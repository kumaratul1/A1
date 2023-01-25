public class Array_7 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,7,98,-6};
        int min=Integer.MAX_VALUE;
        for(int element:arr)
        {
            if(element<min)
            {
                min=element;
            }
        }
        System.out.println("the smallest number is : "+min);
    }
}
