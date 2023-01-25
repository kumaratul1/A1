import java.util.Scanner;
import java.util.Random;
public class rockGame {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.print("Please enter 0 for Rock, 1 for Paper and 2 for Scissor : ");
        int userInput= S.nextInt(3);
        Random R= new Random();
        int computerInput= R.nextInt(3);

        if (userInput == computerInput)
        {
            System.out.println("Match is Draw");

        }
        else if(userInput== 0 && computerInput==2 || userInput == 1 && computerInput==0 || userInput == 2 && computerInput==1)
        {
            System.out.println("You Win The Match");
        }
        else {
            System.out.println("You Loose the Match");
        }
        System.out.println("Computer Input is :"+ computerInput);




    }
}
