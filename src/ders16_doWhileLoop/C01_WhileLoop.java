package ders16_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {
        //10,11,12 sayılarını toplayan bir while loop olusturalım

        int sayi=10;
        int toplam=0;

        while(sayi<=12){
            toplam+=sayi;
            sayi++;
        }
        /*
        while loop da 2 problem olusabilir
        1-once degeri kontrol edip sonra islem yaptıgimizdan
        body de bir kez daha kontrol etmemiz gerekebilir
        2-yapilan islem sayisindan bir fazla while bitis sarti kontrol edilir
        3-while loop oncesinde degerleri kontrol edecegimiz bir variable olusturuyorsak
        ona yapacagimiz atamayi dikkatli yapmamiz gerekir.
        yanlis deger ataması yapmak, while loop un calismamasına neden olablir.
         */

        System.out.println(toplam);





    }
}
