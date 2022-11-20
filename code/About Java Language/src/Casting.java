public class Casting {
    public static void main(String[] args) {

        //casting
        double price = 100.00;
        double final_price = price + 18;      // this is called implicit casting where double datatype store int value
        System.out.println(final_price);
        // so since double datatype has 8 bit whereas int stores only in 4 bits if we try to store
        //double value in int then some values (after decimal point) will be neglected.
        // for this we use parenthesis and put the datatype that we have to change : double (18.93) is changed to int

        double MRP = 100;
        int Total = (int) (MRP + 18.93);
        System.out.println(Total);

    }
}
