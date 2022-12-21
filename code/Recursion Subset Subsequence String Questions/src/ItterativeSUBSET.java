import java.util.ArrayList;
import java.util.List;

public class ItterativeSUBSET {
    public static void main(String[]args){
        int[] arr= {1,2,3};
        System.out.println(subset(arr));
    }
    static List<List<Integer>>  subset(int[]arr){
        List<List<Integer>> outer = new ArrayList<>();
        for(int num :arr){
            for (int i = 0; i < num; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                outer.add(internal);

            }

        }

        return outer;
    }

}
