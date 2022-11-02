package ders14_methodOlusturma;

import java.util.Scanner;

public class C01_Carpım {

    //main metod icinde kullanicidan iki sayi alin
    //bu iki sayiyi parametre olarak kabul edip, carpimlarını main metoda donduren bir metod olututrun


    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double sayi1= scan.nextDouble(); //5
        double sayi2= scan.nextDouble(); //3
        System.out.println(carpimMetodu(sayi1,sayi2)); //15.0

        double carpimSonucu= carpimMetodu(6,2); //12

    }


    public static double carpimMetodu(double sayi1,double sayi2){
        System.out.println("carpim methodu calisti");

        return sayi1*sayi2;

    }




}
