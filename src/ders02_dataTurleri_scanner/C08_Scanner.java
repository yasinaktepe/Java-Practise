package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
// Kullanıcıdan 2 sayı alıp degerleri yer  degistirin

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen birinci tam sayiyi giriniz");

        int sayi1 = scan.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz");

        int sayi2 = scan.nextInt();

        int bos;

        bos=sayi2;

        sayi2=sayi1;

        sayi1=bos;

        System.out.println("sayi1 in degeri : " + sayi1);
        System.out.println("sayi2 in degeri : " + sayi2);
















    }
}
