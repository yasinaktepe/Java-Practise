package ders15_overLoading_whileLoop;

public class C08_rakamlarToplami {
    public static void main(String[] args) {

        //While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

        int sayi=1453;

        int birlerbasamagÄ±=0;
        int rakamlartoplami=0;

        while (sayi!=0){

            birlerbasamagÄ±=sayi%10;
            rakamlartoplami+=birlerbasamagÄ±;
            sayi/=10;



        }
        System.out.println(rakamlartoplami);
    }
}
