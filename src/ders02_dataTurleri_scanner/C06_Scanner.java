package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        //Kullanıcıdan bir dikdörtgenin köşelerinin alıp alanını yazdırın

        Scanner scan = new Scanner(System.in);

        System.out.println("dikdortgenin iki kenar uzunlugunu giriniz" +
                "\niki kenar uzunlugu arasinda enter'a basin");

        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();

        System.out.println("dikdortgenin alanı : "+ kenar1*kenar2);
    }
}
