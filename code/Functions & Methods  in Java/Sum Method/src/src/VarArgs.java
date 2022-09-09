import java.util.Arrays;
import java.util.Scanner;

public class VarArgs {                                   //VarArgs means variable length argument.
    public static void main(String[] args) {
        fun(23, 45, 43, 3, 46, 46, 43, 63);

        multiple(13, 56, 77, 2, 30, 44);

        Scanner in =new Scanner(System.in);

        auto(23,22,44,11,10);


    }
    static void auto(int ...w){
        System.out.println(Arrays.toString(w));
    }

    static void multiple(int a,int b, int ...s) {

        System.out.println(Arrays.toString(s));
    }

    static void fun (int ...v) {
        System.out.println(Arrays.toString(v));
    }
}

