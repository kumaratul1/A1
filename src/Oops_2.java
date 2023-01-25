class cellphone{
    public void ring(){
        System.out.println("Ringing......");
    }
    public void vibrate(){
        System.out.println("Vibrating......");
    }
    public void callaFriend(){
        System.out.println("Calling.....");
    }
        }
public class Oops_2 {
    public static void main(String[] args) {
        cellphone Samsung= new cellphone();
        Samsung.ring();
        Samsung.vibrate();
        Samsung.callaFriend();
    }
}
