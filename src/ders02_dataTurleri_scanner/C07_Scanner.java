package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
         //Kullanıcının isim soyisim ve yaş alıp formatta olulturalım

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        //next() sadece ilk space nextline() ise satırdaki tum bilgiyi alir
        String isim = scan.nextLine();

        System.out.println("Lutfen soyisminizi yaziniz");

        String soyisim = scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");

        double yas = scan.nextDouble();

        System.out.println("Isminiz :" + isim.toUpperCase() +
                "\nsoyisim :" + soyisim.toUpperCase()  +
                "\nyas :" + yas  +
                "\nKaydiniz basariyla tamamlanmistir");
    }
}
