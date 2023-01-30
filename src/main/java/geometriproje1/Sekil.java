package geometriproje1;

public class Sekil {

     /* 1-asagidaki hiyarasiye gore class creat ediniz...
     sekil <--Cember
     sekil <--Dikdortgen<--Kare
    2- Turetilen class'a uygun olanlarina yaricap,  uzunluk ve genislik ekleyiniz.
    3- Runner class'da obj'lerin  alan ve cevre hesaplamasi yaptirip sonuclari yazdiriniz.
    */

   public double uzunKenar;
   public double kisaKenar;
   public double kenar;
   public double yaricap;
   public double pi= 3.14;
   public double yetkisiz =1;

   public Sekil (double uzunKenar, double kisaKenar){
       this.uzunKenar=uzunKenar;
       this.kisaKenar=kisaKenar;


   }

   public Sekil (double yaricap,double pi,double yetkisiz){
      this.yaricap=yaricap;
      this.pi=pi;
      this.yetkisiz=yetkisiz;

   }
    public Sekil (double kenar){
        this.kenar=kenar;


    }
   public double alan(){
       return 0;
   }
   public double cevre(){
       return 0;
   }


    }

