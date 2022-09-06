import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); 
        int a=0;                // a and b are fixed numbers or fibonacci series always starts with 0,1 
        int b=1;
        int count =2;           // counting of changing nums begins from 2 (i.e 0,1,1,2,...)

        while (count <=n) {     // loop continues till nth num/integer

            int temp=b;         // tempary number assigned to b
    
            b=b+a;              // new b = old b + a

            a= temp;            // new a = old b (i.e temp)
        
            count++;
        }    
   System.out.println(b);

    }
}
