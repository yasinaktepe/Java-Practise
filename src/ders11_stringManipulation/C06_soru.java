package ders11_stringManipulation;

import java.util.Locale;

public class C06_soru {

    public static void main(String[] args) {
        // Soru 1 : Kullanicidan bir cumle alin
        // - cumlede ev geciyorsa, "home home sweet home" yazdirin
        // - cumlede is geciyorsa, "calismak guzeldir"
        // - ikisini de iceriyorsa "Hem ev lazim hem is"
        // - hicbirini icermiyorsa "cok calisman lazim" yazdirin

        String cumle="Eve geldim,isler birikmis";

        String cumleCopy=cumle.toLowerCase(Locale.ROOT);

        if(cumleCopy.contains("ev") && cumleCopy.contains("is")){
            System.out.println("Hem ev lazim hem is");

        }else if  (cumleCopy.contains("ev")){
            System.out.println("home home sweet home");

        } else if (cumleCopy.contains("is")) {
            System.out.println("calismak guzeldir");

        }else {
            System.out.println("cok calisman lazim");
        }


    }
}
