package ders35_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_TryCatch {
    public static void main(String[] args) {
        //kullanicidan istedigi kadar sayi girmesini isteyip
        //girilen sayilari toplayin
        //Kullanicinin islemi bitirmek icin Q ya basmasini isteyin
        //Q ya basildiginda toplam kac sayi girdigini ve bu sayilarin toplaminin
        //kac oldugunu yazdirin

        Scanner scan= new Scanner(System.in);
        double girilensayi=0;
        double sayilarinToplami=0;
        int sayac=0;
        boolean devam=true;




        while (devam){

            System.out.println("Toplamak uzere sayi giriniz. \nBitirmek icin Q ya basiniz");


            try {
                girilensayi=scan.nextDouble();
                sayilarinToplami+=girilensayi;
                sayac++;

            } catch (InputMismatchException e) {

                String str=scan.next();
                if (str.equalsIgnoreCase("q")){
                    break;
                }




            }



        }

        System.out.println("Girilen " + sayac + " adet sayinin toplami " + sayilarinToplami );

    }

}
