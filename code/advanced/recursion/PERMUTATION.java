package advanced.recursion;
import java.util.ArrayList;

public class PERMUTATION {
    public static void main(String[] args) {
            permutations("", "abc");                                 //Don't put space in processed string p
            System.out.println(permutationsInList("", "abc"));

            System.out.println(permutationsCount("","abc"));
        }
        static void permutations(String p, String up){
            if(up.isEmpty()){
                System.out.println(p);
                return;
            }

            char ch = up.charAt(0);
            // we have to make variable length of recursive call
            for (int i = 0; i <= p.length(); i++) {
                String f = p.substring(0,i);
                String s = p.substring(i, p.length());
                permutations(f + ch +s,up.substring(1));

            }
        }

        static ArrayList<String> permutationsInList(String p , String up){
            if(up.isEmpty()){
                ArrayList<String> list = new ArrayList<>();
                list.add(p);
                return list;
            }

            char ch = up.charAt(0);
            ArrayList<String> ans = new ArrayList<>();

            // we have to make variable length of recursive call
            for (int i = 0; i <= p.length(); i++) {
                String f = p.substring(0,i);
                String s = p.substring(i, p.length());
                ans.addAll(permutationsInList(f + ch +s,up.substring(1)));
            }
            return ans;
        }

        static int permutationsCount(String p, String up){
            if(up.isEmpty()){
                return 1;
            }
            int count =0;

            char ch = up.charAt(0);
            // we have to make variable length of recursive call
            for (int i = 0; i <= p.length(); i++) {
                String f = p.substring(0,i);
                String s = p.substring(i, p.length());
                count = count + permutationsCount(f + ch +s,up.substring(1));

            }
            return count;
        }

}
