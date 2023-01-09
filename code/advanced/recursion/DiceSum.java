package advanced.recursion;
import java.util.ArrayList;

public class DiceSum {
    public static void main(String[] args) {
        dice("",4);   //permutation of dice number
        System.out.println(diceRet("",4));
//        diceFace("",4,8);

    }

    private static void diceFace(String p, int target, int face) {
        if (target ==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= face && i <= target; i++) {
            diceFace(p+i,target-i,face);
        }
    }

    static void dice(String p, int target){

        if (target ==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p+i,target-i);
        }
    }




    static ArrayList diceRet(String p, int target){

        ArrayList<Integer> list = new ArrayList<>();
        if (target ==0){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(diceRet(p+i,target-i));

        }return list;
    }

}
