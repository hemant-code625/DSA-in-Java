import java.util.ArrayList;

public class SUBSET {
    public static void main(String[]args){
        str("", "abc");
        System.out.println(subseqRet("", "abc"));


    }
    static void str(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        //Take the value ch
        str(p+ch,up.substring(1));
        //Leave the value ch
        str(p, up.substring(1));

    }

    // passing the ArrayList in the function body
    static ArrayList<String> subseqRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        char ch = up.charAt(0);
        ArrayList<String> FromLeft = subseqRet(p +ch, up.substring(1));  // Taking the ch element of string
        ArrayList<String> FromRight = subseqRet(p, up.substring(1));       //Removing the ch element of string

        FromLeft.addAll(FromRight);
        return FromLeft;

    }

}
