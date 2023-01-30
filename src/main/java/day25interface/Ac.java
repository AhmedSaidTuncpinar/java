package day25interface;

public interface Ac extends BigAc{

    public void digital();

     void price();

      int price = 2300;

      String name= "Perfect AC";

      public default int calculate(){

          return 1200;


      }
      public static boolean climate(){
          return true;
      }


}
    /*
    1)An interface cannot have "concrete method"
    2)All methods in an interface are "public" and "abstract" as default
    Because of that; even you don't declare the methods "public" and "abstract", they will be "public" and "abstract"
    "public abstract void digital();" and "void digital();" are same
    3)If "parent interfaces" have methods with the same name, overriding just one of them will be enough.
    4) Parent interfaces can not have methods with the same name and the different return types. if you do that,
    java will give you compile time error.
    5) Variables in an interface are public, static and final.
    public static final int price= 2300; and int price=2300 are same.
    6) Variables in interfaces are static default, therefore no need to create object to access.
    7) Whenever you need to call any variable use interface name, like Brake.luxury
    8) To create concret method in an interface you have 2 options;
        a. use default keyword b. use static keyword

    9) "Class" parent of another "Class" ==> extends
   "Interface" parent of another "Interface" ==> extends

   "Interface" parent of "Class" ==> implements
   "Class" parent of "Interface" ==> impossible. ==> An "Interface" can have "just" Interface as parent

    */
