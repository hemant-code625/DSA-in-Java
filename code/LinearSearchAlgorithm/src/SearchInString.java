import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("If shows nothing then Target Not found");
        System.out.print("Enter Your Name:");

        String name = in.next();
        char target = 'r';                      //Be very careful at this only single Apostrophe is used otherwise will show error...
        // System.out.println(search(name, target));
        search(name, target);
    }

    static void search(String str, char target) {
       /* if (str.length() == 0) {
            return false;
        }                                                          //No need to write this if function because at
          */                                                         // the end of the boolean search function it's returning false.
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                System.out.println("Target r is found.");
            }

        }

        }


}