package ders29_stringBuilder_accessModifier;

public class C02_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Java Candir");

        System.out.println(sb1.reverse()); //ridnaC avaJ

        System.out.println("Tersini yazdirdiktan sonra sb1" + sb1);

        System.out.println(sb1.insert(0, ".")); //.ridnaC avaJ

        System.out.println(sb1);

        sb1.reverse();

        StringBuilder sb2=new StringBuilder("Java Candir.");
        String str="Java CAndir";

        System.out.println(sb1 == sb2); //false  icerik ayni ols bile false verir
        System.out.println(sb1==sb1);  //true
       // System.out.println(sb1==str);   farkli iki data turu ile karsilastirilamaz

        System.out.println(sb1.equals(sb2)); //false
        System.out.println(sb1.equals(sb1)); //true
        System.out.println(sb1.equals(str));  //false

        System.out.println(sb1.compareTo(sb2)); //0
        StringBuilder sb3=new StringBuilder("Hava Candir");
        System.out.println(sb1.compareTo(sb3)); //2

        /*
        CompareTo sadece tamamen ayni mi yoksa farkli mi sorusunun cevabini verir
        tamamen ayni ise==> 0 doner
        farklilik varsa ==> ilk farkli harfi bulduysa, farkli harflerin arasinda kac harf oldugunu verir.
         */



















    }
}
