package ders11_stringManipulation;

public class C08_soru {
    public static void main(String[] args) {

         //Kullanicidan bir sifre isteyip,
         // asagidaki sartlari kontrol edin ve
         // kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali

        String sifre= "Nasılsın Kardes";
        int bayrak=0;


        if(!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){
            System.out.println("ilk harf kucuk olmalı");
            bayrak++;
        }

        if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')){
            System.out.println("Son karakter rakam olmalı");
            bayrak++;
        }
        if(sifre.contains(" ")){
            System.out.println("Sifre bosluk içermemeli");
            bayrak++;
        }
        if(!(sifre.length()>=10)){
            System.out.println("Sifre en az 10 haneli olmalı");
            bayrak++;
        }
        if (bayrak==0){
            System.out.println("sifre basarıyla kaydedildi");

        }






















    }
}
