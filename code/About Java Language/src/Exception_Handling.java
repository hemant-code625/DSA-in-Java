public class Exception_Handling {
    public static void main(String[] args) {
        //TRY -CATCH IN EXCEPTION HANDLING
        int [] marks ={12,33,43};
        // System.out.println(marks[4]);    after showing exception in thread:Index out of bound the next code line
        //                                  is not executed and thus if we think there will be an exception we use try and catch


        try{
            System.out.println(marks[4]);
        } catch (Exception exception){
            //do something after catching

        }
        System.out.println("The Student name is Ankit");

    }
}
