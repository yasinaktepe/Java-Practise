package ders15_overLoading_whileLoop;

import java.util.Scanner;

public class C04_whileLoop {
    public static void main(String[] args) {
        /*
        kullanicidan toplanmak uzere tamsayilar alin
        kullanici 0 a basarsa sayi alma islemini bitirin
        kullanicinin kac sayi girdigini ve bu sayilsarin toplaminin kac oldugunu yazdirin
         */

        Scanner scan=new Scanner(System.in);
        int girilensayi=5;    //verilen ilk deger bu soru icin 0 olmamali

        int sayac=0;
        int toplam=0;


        while (girilensayi!=0){
            System.out.println("Lutfen toplamak icin tamsayi girin" +
                    "\nbitirmek icin 0 a basin");
            girilensayi= scan.nextInt();

            if (girilensayi!=0){

                sayac++;
                toplam=toplam+girilensayi;
            }

        }


        System.out.println("Girilen "+ sayac + " adet sayinin toplami " + toplam);






    }
}
