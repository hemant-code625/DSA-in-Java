import java.util.Scanner;

public class Guess_the_numberGame {
    public static void main(String[] args) {
        int myNum = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a number from 0 to 100: ");
        int userNum = 0;


        while (true){
            userNum = sc.nextInt();
            if(userNum == myNum){
                System.out.println("WOOHO.. Correct!!");
                break;
            }
            else if(userNum > myNum){
                System.out.println("Too Large");
            }else {
                System.out.println("Too Small");
            }
            if(userNum<0){
                System.out.println("GAME OVER");
                break;
            }
        }

        System.out.println("My number was: ");
        System.out.println(myNum);
    }
}
