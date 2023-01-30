package day25interface;

public class Honda implements Ac,Break, Engine{

    @Override
    public void digital() {
        System.out.println("This is digital Ac");
    }

    @Override
    public void secureBreak() {
        System.out.println("It stops securely");

    }

    @Override
    public void ecoEngine() {
        System.out.println("This is ecoE engine");

    }

    @Override
    public void price() {
        System.out.println("Break Price");

    }




}
