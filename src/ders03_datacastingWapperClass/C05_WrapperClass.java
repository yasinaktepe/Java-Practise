package ders03_datacastingWapperClass;

public class C05_WrapperClass {

    public static void main(String[] args) {

        int sayi = 10;
        String str = "Java cok guzel";

        /*
        Primitive data türleri sadece deger barındırırlar, hazır methodları yoktur

        javaya yapılan talepler sonucunda java primitive data türleri ile bazı hazır methodların kullanılabilmesi icin Wrapper class
        lar olusturmustur. Wrapper classlar primitive data turlerindeki degerleri alirlar ancak methodlarıda vardır.
         */

        char krk= 'b';
        Character krkWrapper= 'c' ;

        System.out.println(Character.isLetter('5')); // false

        System.out.println(Character.isDigit('7')); //true


        String str1= "123";
        String str2= "12";

        //str1 ve str2 nin degerlerini matematiksel olarak toplayın

        System.out.println(str1+str2);

        System.out.println(Integer.parseInt(str1)+ Integer.parseInt(str2));//135


        //Integer.parseInteger(str) içine yazılan str rakamlardan olusuyorsa str i int a cevirir
        //ancak bir karakter bile rakam deegilse hata verir

        System.out.println(Integer.MAX_VALUE);

        System.out.println(Short.MIN_VALUE);


























    }
}
