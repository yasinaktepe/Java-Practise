package ders03_datacastingWapperClass;

public class C01_dataCasting {

    public static void main(String[] args) {

        /*
        bazı data türleri asla birbirine cast edilemez
         */

       // String str=20;

       // boolean mutluMu="true";

      //  int a=true;


        double s = 20 ;

        int sayi = 15 ;

        long ln= sayi ;
        /*
        dar data türünden bir degeri genis data turunden bir variable a yaparsanız java bunu otomatik yapar
         */
        short sh=23;

        int a= sh;

        long lng= sh;

        float fl= lng;


        /*
        ama tersini yapmak isterseniz
        yani buyuk data turundeki bir veriyi kucuk data turundeki variable a atamak isterseniz java kabul etmez
         */

        double dbl=20;





    }
}
