public class Array_2 {
    public static void main(String[] args) {
        int[] marks= {78,89,95,82,76};
        int num= 56;
        boolean isInArray= false;
        for(int element:marks) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The number is present in array");
        }
        else {
            System.out.println("the number is not present in array");
        }
        }
    }

