package geometriproje1;

public class Diktortgen extends Sekil{

    public Diktortgen(double uzunKenar, double kisaKenar){
        super(uzunKenar,kisaKenar);

    }

    public Diktortgen(double kenar){
        super(kenar);
    }

    @Override
    public double alan() {
      return uzunKenar*kisaKenar;
    }

    @Override
    public double cevre() {
        return 2*(uzunKenar*kisaKenar);
    }

    @Override
    public String toString() {
        return  "Kisakenar= " + kisaKenar+ "Uzunkenar= " + uzunKenar + "Alan="+ alan() + "cevre" + cevre();
    }
}
