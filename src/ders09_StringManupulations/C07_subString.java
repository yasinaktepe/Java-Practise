package ders09_StringManupulations;

public class C07_subString {
    public static void main(String[] args) {

        String str="Java gun gectikce guzellesiyor";

        System.out.println(str.substring(5,8));//gun
        //5. index dahil(inclusive), 8. index hariç(exclusive)

        System.out.println(str.substring(9,17));//gectikce

        System.out.println(str.substring(3,7));

        String isim="huseYIN";
        //verilen ismi ilk harfi buyuk geriye kalanlar kucuk harf olarak yazdirirn

        System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase());

        isim=isim.substring(0,1).toUpperCase()+
                isim.substring(1).toLowerCase();

        System.out.println(isim);

        System.out.println(isim.substring(2,5));//sey

        //sadece 3.indexdeki harfi yazdırın

        System.out.println(isim.substring(3,4));

        System.out.println("zor sorunun cevabi : " +isim.substring(2,2)); //"" hiclik yazdirir

      //  System.out.println(isim.substring(5,2));//StringIndexOutOfBoundsException














    }
}
