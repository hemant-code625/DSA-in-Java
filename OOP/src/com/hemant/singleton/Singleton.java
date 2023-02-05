package com.hemant.singleton;


public class Singleton {
    static String name;
    private Singleton(String naam){
        Singleton.name = naam;
    }
    private static Singleton instance;          //creating a private and static (because this will be used
    // in static function of getInstance) instance called instance
    public static Singleton getInstance(){
        //check whether only 1 obj is created or not
        if(instance == null){
            instance = new Singleton("Dude It's Singleton");
            System.out.println(Singleton.name);                   //because name string is static, so it's better to use class.name rather than this.name
        }
        return instance;
    }

}
