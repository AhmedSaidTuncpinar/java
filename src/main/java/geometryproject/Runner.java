package geometryproject;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen girmek istediğiniz geometrik şekil için bir numara seçiniz");
        System.out.println("1=Kare" +" "+ "2=Dikdortgen" +" "+ "3=Cember");

        int obj= input.nextInt();


        switch (obj){

            case 1:
                System.out.println("Kare için bir kenar giriniz?");
                Kare obj2= new Kare(input.nextDouble());
                obj2.alan();
                obj2.cevre();
                System.out.println(obj2);
                break;
            case 2:
                System.out.println("Dikdörtgen için bir uzun bir de kısa kenar giriniz");
                Diktortgen obj3= new Diktortgen(input.nextDouble(), input.nextDouble());
                obj3.alan();
                obj3.cevre();
                System.out.println(obj3);
                break;
            case 3:
                System.out.println("Çember için bir yarıçap giriniz");
                Cember obj4 = new Cember(input.nextDouble(), 3.14, 1);
                obj4.alan();
                obj4.cevre();
                System.out.println(obj4);
                break;

            default:
                System.out.println("Yanlış veri girdiniz");


        }

    }
}
