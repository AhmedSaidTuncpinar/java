package geometriproje1;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen geometrik şekiller için bir rakam giriniz");
        System.out.println("1.Kare, 2.Dikdörtgen, 3.Çember");
        int obj= input.nextInt();


        switch (obj){

            case 1:

                System.out.println("Lütfen Kare için bir kenar giriniz");
                Kare obj1 =new Kare(input.nextDouble());
                obj1.alan();
                obj1.cevre();
                System.out.println(obj1);
                break;
            case 2:
                System.out.println("Lütfen Diktörtgen için bir uzun bir kısa kenar giriniz");
                Diktortgen obj2=new Diktortgen(input.nextDouble(), input.nextDouble());
                obj2.alan();
                obj2.cevre();
                System.out.println(obj2);
                break;
            case 3:
                System.out.println("Lütfen bir çember için yarıcap giriniz");
                Cember obj3= new Cember(input.nextDouble(), 3.14,1);
                obj3.alan();
                obj3.cevre();
                System.out.println(obj3);
                break;
            default:
                System.out.println("Lütfen 1 den 3 e kadar bir rakam giriniz");
        }

    }
}
