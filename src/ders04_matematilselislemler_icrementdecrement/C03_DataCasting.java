package ders04_matematilselislemler_icrementdecrement;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {

        //kullanıcıdan 2 int deger alıp bunları birbirine bolun ve sonucu double olarak yazdırın

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen iki sayi giriniz");

        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        System.out.println(sayi1/sayi2); //3

        double ondaliklisonuc=(double) (sayi1/sayi2);

        System.out.println(ondaliklisonuc); //3.0

        double dogrusonuc=(double)sayi1/sayi2; // double/int ===> genis olana gore sonuc verir

        System.out.println(dogrusonuc); // 3.333333333333333333


















































    }
}
