package day25interface;

public class CarRunner {

    public static void main(String[] args) {

        Honda h= new Honda();

        System.out.println(Ac.price);
        System.out.println(Break.price);
        System.out.println(Engine.price);

        System.out.println(Break.luxury);

        Honda h1= new Honda();
        System.out.println(h1.calculate());
        System.out.println(Ac.climate());
    }
}
