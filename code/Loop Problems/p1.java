import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b= in.nextInt();
            int c= in.nextInt();
            
            //Q: Find largest of three

            int max= a;
            if (b> max){
                max =b;
            } if (c> max){
                max=c;
             } System.out.println(max);
             
        }
        
    }
