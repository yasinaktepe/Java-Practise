package ders06_ifElsestatment;

import java.util.Scanner;

public class C01_ifStatements {
    public static void main(String[] args) {
        //Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        // NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        //Kullanici o veya O yazdiginda output Ocak olsun.


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen ay isminin ilk harfini girin");

        char ilkharf= scan.next().charAt(0);

        if(ilkharf=='o'|| ilkharf=='O' ){
            System.out.println("Ocak");
        }

        if(ilkharf=='a' || ilkharf=='A'){
            System.out.println("Subat");
        }

        if(ilkharf=='m' || ilkharf=='M'){
            System.out.println("Mart veya Mayıs");
        }

        if(ilkharf=='n'|| ilkharf=='N'){
            System.out.println("Nisan");
        }

        if(ilkharf=='h' || ilkharf=='H'){
            System.out.println("Haziran");
        }

        if(ilkharf=='t' || ilkharf=='T'){
            System.out.println("Temmuz");
        }

        if(ilkharf=='a' || ilkharf=='A'){
            System.out.println("Agustos veya Aralık");
        }
         if(ilkharf=='e' || ilkharf=='E'){
             System.out.println("Eylul veya Ekim");

         }

        if(ilkharf=='k' || ilkharf=='K'){
            System.out.println("Kasım");

        }














































    }

}
