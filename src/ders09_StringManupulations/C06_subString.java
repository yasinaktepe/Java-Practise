package ders09_StringManupulations;

public class C06_subString {
    public static void main(String[] args) {

        String str= "Java ogren, isi kap";

        System.out.println(str.substring(5));//ogren, isi kap

        System.out.println(str.substring(0));//Java ogren, isi kap

        System.out.println(str.length());//19

        String sonHarf =""+str.charAt(str.length()-1);

        sonHarf=str.substring(str.length()-1);
        System.out.println(sonHarf);//p

        //son index deki karakteri uppercase olarak yazdırın

        System.out.println(str.substring(str.length()-1).toUpperCase());

        //son 3 harfi buyuk harf olarak yazdırın

        System.out.println(str.substring(str.length()-3).toUpperCase());//KAP

    }
}
