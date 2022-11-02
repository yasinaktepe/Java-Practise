package ders15_overLoading_whileLoop;

import java.util.Scanner;

public class C05_whileLoop {
    public static void main(String[] args) {

        /*
        kullanicidan toplanmak uzere sayi alın sayilarin toplami 500 esit veya gecerse

        girilen sayi adedi
        girilen sayilarin toplaminin yzdirin
        "Bu kadar yeter" yazdirin
         */

        Scanner scan=new Scanner(System.in);
        double girilensayi=1;
        int sayac=0;
        int toplam=0;

        while (toplam<500){

            System.out.println("Lutfen toplamak icin sayi giriniz");

            girilensayi= scan.nextDouble();

            toplam+=girilensayi;
            sayac++;





        }
        System.out.println("Girilen " +sayac+ " sayinin toplami : " +toplam + " oldu. Bu kadar yeter");

    }
}
