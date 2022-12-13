import jdk.jshell.Snippet;

public class StringRemovingAlpha {
    public static void main(String[]args){
        skip(" ","baccdaha ");

        System.out.println(skip("baccadha"));

    }


    static void skip(String p, String up){           //p =processed , up= unprocessed
        //Base Condition
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p,up.substring(1));
        }else{
            skip(p+ch,up.substring(1));
        }

    }

    static String skip(String up){           //p =processed , up= unprocessed
        //Base Condition
        if(up.isEmpty()){
            return up;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            return skip(up.substring(1));
        }else{
            return ch + skip(up.substring(1));
        }

    }
}
