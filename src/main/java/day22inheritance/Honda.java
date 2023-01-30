package day22inheritance;


public class Honda extends Car {

    public void hondaMake() {
        System.out.println("Honda cars are hondaMade");
    }

    public Honda()
    {
        System.out.println("Honda class constructor 1");
    }
    public Honda(boolean isNew){
        super("Hybrid");
        if (isNew){
            System.out.println("Brand new");
        }else {
            System.out.println("Used");
        }
    }
}
