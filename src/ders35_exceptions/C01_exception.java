package ders35_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_exception {
    public static void main(String[] args) {

        //Kullanicidan bir tam sayi alin
        //ve sayinin karesini yazdirin
        //Kullanici ondalıklı sayi girerse kullaniciya uyari yzisi yazdirip
        //tekrar sayi isteyen bir metod olusturun

        sayiAlKaresiniYazdir();
    }

    public static void sayiAlKaresiniYazdir(){

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");



        try {
            int girilensayi = scan.nextInt();
            /*
            Eger ondalikli sayi girilirse 25. satir exception verecek ve
            catch bloguna kadar olan diger kodlar calismayacak
            catch blogu hata yakalandiginda ne yapmasini istedigimizi soyledigimiz bolumdur

            bu soruda istenen exception olustugunda deger istenmesi
            biz de exception olustugunda yeniden methodu calistirdik

            hata olmazsa catch blogu devreye girmez ve kod normal bir sekilde biter
             */
            System.out.print("Girdiginiz sayinin karesi : ");
            System.out.println(girilensayi*girilensayi);
        } catch (InputMismatchException e) {

            System.out.println("Sana tam sayi degeri gir dedik :) ");
            sayiAlKaresiniYazdir();


        }




    }
}
