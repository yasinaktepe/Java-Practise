package ders14_methodOlusturma;

public class C04_Tekrar {
    public static void main(String[] args) {


        int a=10;
        int b=20;

        //bu iki sayinin carpım sonucunu yeni kod yazmadan consola yazdirin

        System.out.println(C01_Carpım.carpimMetodu(a, b));


        String c="Nasil";
        String d="yani";
        //bu iki stringi aralarinda bir bosluk birakarak yazdirin

        System.out.println(C02_StringConcate.birlestirMethodu(c, d));


        String e ="Bu da mi oldu?";

        System.out.println(C03_StringTersecevirme.stringiTerseCevir(e));

        System.out.println(C03_StringTersecevirme.stringiTerseCevir("bu cumleyi terse cevirin"));

        String str="Java cok guzel";

        System.out.println(str.toUpperCase());


    }



}


