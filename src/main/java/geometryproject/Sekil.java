package geometryproject;

public class Sekil {


    /*
    1-asagidaki hiyarasiye gore classlar create ediniz...

     sekil <--Cember
     sekil <--Dikdortgen<--Kare

    2- Turetilen class'a uygun olanlarina yaricap,  uzunluk ve genislik veriable'ler ekleyiniz.
    3- Runner class'da  Cember Dikdortgen Kare alan ve cevre hesaplamasi yaptirip sonuclari yazdiriniz.
    Not: Dairenin Çevresi = 2 x π x r şeklinde hesaplanır. π= 3.14 olarak alınınz.

 */

        public double uzunKenar;
        public double kisaKenar;
        public double yaricap;
        public double kenar;
        public double pi = 3.14;
        public double etkisiz=1;

    public Sekil(double uzunKenar, double kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;

    }

    public Sekil(double yaricap, double pi, double etkisiz){
        this.yaricap=yaricap;
        this.pi=pi;
        this.etkisiz=etkisiz;

    }
    public Sekil(double kenar){
        this.kenar=kenar;
    }


    public double alan(){

        return 0;
    }

    public double cevre(){

        return 0;
    }

}
