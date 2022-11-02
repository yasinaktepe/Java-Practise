package ders13_nestedForLoop_methoddOluşturma;

import java.util.Scanner;

public class C08_methodOlusturma {
    public static void main(String[] args) {

        /*kullanicidn 2 sayi alip bunlarin toplamini yazdiran bir metod oluşturun

         */

        istetoplayazdir();
        istetoplayazdir();

    }

    public static void istetoplayazdir(){

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double sayi1=scan.nextDouble();
        double sayi2= scan.nextDouble();

        System.out.println("Girilen sayilarin toplami : " + (sayi1+sayi2));

    }





}
