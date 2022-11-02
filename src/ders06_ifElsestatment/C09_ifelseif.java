package ders06_ifElsestatment;

import java.util.Scanner;

public class C09_ifelseif {
    public static void main(String[] args) {

        //kullanicidan bir tam sayi alin
        //sayi negatifse gecersiz sayi
        //tek basamaklıysa rakam
        //iki basamaklı ise iki basamaklı
        //bunun disindaki sayilat icin buyuk sayi yazdirin

       int sayi=100000;

       if(sayi<0){
           System.out.println("Gecersiz sayi");
       } else if (sayi<10) {
           System.out.println("Rakam");

       } else if (sayi<100) {
           System.out.println("iki basamakli sayi");


       }else {
           System.out.println("buyuk sayi");
       }


    }
}
