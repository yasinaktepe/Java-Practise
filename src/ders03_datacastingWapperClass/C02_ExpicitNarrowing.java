package ders03_datacastingWapperClass;

public class C02_ExpicitNarrowing {

    public static void main(String[] args) {

        int sayi=20;

        /*
        genis data turunden bir degeri dar data turundeki bir variable a atamak isterseniz java sorumlulugu
        almanızı ister

        bu sorumlulugu almak icin cast edeceginiz degerin onune () icerisinde cast etmek istediginiz data turu yazilir

        ancak bu durumda data kayipları (double dan int e gecerken virgulden sonrasi silinir)
        veya baskalasim olabilir ( int i byte cevirirsek tekrar tekrar basa doner)
         */

        short sh=(short)sayi;

        System.out.println(sh);//20

        double dbl = 23.5;

        int say = (int)dbl;

        System.out.println(say);

        say=256; // int

        byte byt =(byte) say;

        System.out.println(byt);

















    }
}
