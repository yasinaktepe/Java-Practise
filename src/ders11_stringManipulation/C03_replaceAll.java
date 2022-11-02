package ders11_stringManipulation;

public class C03_replaceAll {
    public static void main(String[] args) {
        String str="J1ava2 G9uzel5dir8";
        //str daki sayıları silip Java Guzeldir haline dönüştürelim
        // str.replaceAll() sadece bir harf veya char sequence i degil
        //genelleme ile soyleyebilecegimiz ortak ozellikteki tum karakterleri degistirir

        System.out.println(str.replaceAll("\\d",""));  //Java Guzeldir

        System.out.println(str.replaceAll("\\D", "")); //12958

        String s1="urun ilk fiyatı : 1250 tl";
        String s2="ikinci urun fiyatı : 1500 tl";

        s1=s2.replaceAll("\\D","");//1250
        s2=s2.replaceAll("\\D","");

        System.out.println(s1+s2);
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));















    }
}
