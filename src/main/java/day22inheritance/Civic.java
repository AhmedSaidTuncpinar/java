package day22inheritance;




public class Civic extends Honda {

    public void ecoEngine(){
        System.out.println("civic use eco engine");
    }
    public Civic()
    {
        System.out.println("Civic class constructor 1");
    }

    public Civic(int year){
        super(true);
        System.out.println(year);

    }
}
