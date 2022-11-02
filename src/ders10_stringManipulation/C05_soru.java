package ders10_stringManipulation;

import java.util.Scanner;

public class C05_soru {
    public static void main(String[] args) {
        /* mail kontrolu yapan bir program hazırlayin
        1-mail @ isareti icermiyorsa "gecersiz email"
        2-@gmail.com icermiyorsa " gmail adresi giriniz"
        3-@gmail.com ile bitmiyorsa "yazım hatası" seklinde yazdırın

         */

        String email="ahmet@bulutluoz.com";

                if(!email.contains("@")){

                    System.out.println("Gecersiz email");

                } else if (!email.contains("@gmail.com")) {
                    System.out.println("gmail adresi giriniz");

                } else if (email.endsWith("@gmail.com")) {
                    System.out.println("yazim hatasi");

                }else{
                    System.out.println("email basari ile kaydedildi");
                }


    }
}
