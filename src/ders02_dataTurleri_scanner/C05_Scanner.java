package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        //kullanıcıdan bir double birde int sayı alıp toplamını ve çarpımını yazdır

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen ondalıklı bir sayi giriniz");
        double ondalıklıSayı= scan.nextDouble();

        System.out.println("Lutfen tam sayı giriniz");
        int tamSayı = scan.nextInt();

        System.out.println("Girilen sayiların toplamı : " + ondalıklıSayı+tamSayı);
        System.out.println("Girilen sayilarin carpimi : " + ondalıklıSayı*tamSayı);






    }
}
