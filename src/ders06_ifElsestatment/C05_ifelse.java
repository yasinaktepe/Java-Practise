package ders06_ifElsestatment;

import java.util.Scanner;

public class C05_ifelse {
    public static void main(String[] args) {

        //Kullanicidan yasini isteyin, 65 yas ve uzeri ise
        // ”Emekli olabilirsin” yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Yasinizi Giriniz");

        double yas= scan.nextDouble();

        if(yas>=65){
            System.out.println("Yasiniz emeklilik icin yeterli");
        }else{
            System.out.println("Emekli olmak icin " + (65-yas) + " sene daha calismalisin");
        }


















    }
}
