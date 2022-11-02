package ders11_stringManipulation;

public class C07_soru {
    public static void main(String[] args) {
        // Kullanicidan isim ve soyismini ayri ayri alin.
        //- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
        // soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk


        String isim="Mehmet";
        String soyisim="Harun";
        String yeniisimsoyisim;

        if(isim.length()>soyisim.length()){

        yeniisimsoyisim= isim.substring(0,1).toUpperCase()+
                                 isim.substring(1).toLowerCase()+
                                 " "+
                                 soyisim.substring(0,1).toUpperCase()+
                                 soyisim.substring(1).toLowerCase();



        }else{

         yeniisimsoyisim=isim.substring(0,1).toUpperCase()+
                         isim.substring(1).toLowerCase()+
                         " "+
                         soyisim.toUpperCase();

        }











































    }







}
