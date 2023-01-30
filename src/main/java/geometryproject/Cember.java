package geometryproject;

import java.util.Scanner;

public class Cember extends Sekil{

 public Cember(double yaricap, double pi, double etkisiz) {
  super( yaricap,pi, etkisiz);
 }

    @Override
    public double alan() {
        return pi*yaricap*yaricap;
    }

    @Override
    public double cevre() {
        return 2*pi*yaricap;
    }

    @Override
    public String toString() {
        return "Yaricap = " + yaricap + " Pi = " + pi + " Etkisiz = " + etkisiz + " Cemberin alani = " + alan() + " Cemberin cevresi = " + cevre();
    }
}