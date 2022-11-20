public class BreakContinue {
    public static void main(String[] args) {

        // BREAK & CONTINUE
        int i =0;
        while(true){             // this is for infinite while loop condition
            if(i == 3){
                i = i+1;
                continue;        // this will skip the below part and get started from while loop
            }
            if(i > 6){
                break;
            }
            System.out.println(i);
            i=i+1;
        }
    }
}
