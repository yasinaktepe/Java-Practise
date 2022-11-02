package ders26_passByvalue_ImmutableClasses;

public class C01_PassByValue {
    public static void main(String[] args) {

        double fiyat = 200;

        System.out.println(indirimUygula(fiyat));// 90
        System.out.println(indirimUygula(fiyat)); // 90
        System.out.println(indirimUygula(fiyat)); // 90

        System.out.println(fiyat); // 100

        fiyat=indirimUygula(fiyat);

        System.out.println("Indirim uygulanmis yeni fiyat :" + fiyat);
    }

    /*
    Kodlarimimzin anlasilir olmasi icin main metodddna diger metodlara parametre olarak
    gonderdigimiz variablelar icin aynı isimli variable olusturmayi tercih ederiz.

    Java metodlar arasinda gecis yaparken variable i degil variable in value sunu pass eder

    Bu Java nin Pass By Value yu tercih etmesinden kaynaklaniyor

    Eger metodun içerisinde yaptıginiz degisikligin main method icin de gecerli olmasini isterseniz
    main metod icerisinde
    fiyat=indirimUygula(fiyat);

    atamasini yapabiliriz.
     */

    public static double indirimUygula(double fiyat) {
        // %10 indirim yapsin

        fiyat= fiyat*0.9;  // fiyata atama yaptik kalici olarak 90 oldu

        return fiyat;
    }
}
