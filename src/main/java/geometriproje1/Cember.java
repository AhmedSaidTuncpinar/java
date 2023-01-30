package geometriproje1;

public class Cember extends Sekil{

    public Cember(double pi, double yaricap,double yetkisiz){
        super(yaricap, pi, yetkisiz);
    }

    @Override
    public double alan() {
        return yaricap*pi;
    }

    @Override
    public double cevre() {
        return 2*(yaricap*pi);
    }

    @Override
    public String toString() {
        return "Yaricap = " + yaricap + " Pi = " + pi + " Etkisiz = " + yetkisiz + " Cemberin alani = " + alan() + " Cemberin cevresi = " + cevre();
    }
}
