package ders03_datacastingWapperClass;

import java.util.Scanner;

public class C03_DataCasting {

    public static void main(String[] args) {

        //kullanıcıdan bir tamsayı alın
        //kullacı kaç girerse girsin konsolda -128 ile +127 arasında bir sonuc yazdiracak kod yaziniz

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz");

        int girilenSayi= scan.nextInt();

        byte donusensayi = (byte)girilenSayi;

        System.out.println("girdiginiz " + girilenSayi + "'nin donusmus hali : " + donusensayi);
























    }
}
