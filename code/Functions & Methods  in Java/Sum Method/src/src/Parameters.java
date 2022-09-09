import java.util.Scanner;

public class Parameters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.next();
        String a = letsgreet(name);

        // String a = letsgreet("Hemant Singh Parmar");
        System.out.println(a);
    }

    static String letsgreet (String name) {
        String message= "hello " + name;
        return message;
    }

}
