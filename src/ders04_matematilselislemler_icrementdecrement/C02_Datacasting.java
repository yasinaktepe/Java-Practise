package ders04_matematilselislemler_icrementdecrement;

import java.util.Scanner;

public class C02_Datacasting {

    public static void main(String[] args) {

        //kullanıcıdan iki double sayı al sonucun tam sayı kısmını yazdır

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen iki sayı giriniz");

        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        int bolmeSonucuTamsayi=(int)(sayi1/sayi2);

        System.out.println(bolmeSonucuTamsayi);
































    }
}
