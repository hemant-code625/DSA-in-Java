public class RemovingLetters {

    public static void main(String[] args) {
        SkipApple("","bcaccappledef");
        SkipAppNotApple(" ","bcaccappldef");           // this string has apple and thus does not remove app
        SkipAppNotApple(" ","bcaccappldef");           //this string does not have appple and thus removed app

    }
    static void SkipApple(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch= up.charAt(0);

        if(up.startsWith("apple") ){
           SkipApple(p,up.substring(5));
        }
        else{
            SkipApple(p+ch, up.substring(1));
        }
    }
    static void SkipAppNotApple(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch= up.charAt(0);

        if(up.startsWith("app") && !up.startsWith("apple")){             //startsWith app only when apple is not present
            SkipAppNotApple(p,up.substring(3));
        }
        else{
            SkipAppNotApple(p+ch, up.substring(1));
        }
    }

}
