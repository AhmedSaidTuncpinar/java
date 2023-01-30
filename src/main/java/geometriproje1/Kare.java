package geometriproje1;

public class Kare extends Diktortgen{

    public Kare(double kenar){
        super(kenar);

    }

    @Override
    public double alan() {
        return kenar*kenar;
    }

    @Override
    public double cevre() {
        return 4*kenar;
    }

    @Override
    public String toString() {
        return " Kenar = " + kenar + " Karenin alani = " + alan() + " Karenin cevresi = " + cevre();
    }
}
