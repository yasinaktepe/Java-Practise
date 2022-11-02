package ders07_Nestedifelse;

public class C03_nestedifelse {
    public static void main(String[] args) {
        //Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak
        // “Emekli olabilirsin” veya
        // “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        char cinsiyet = 'K';
        int yas = 56;

        if (cinsiyet == 'k' || cinsiyet == 'K') {
            if (yas < 15) {
                System.out.println("Hatalı yas girisi");
            } else if (yas < 60) {
                System.out.println("Emekli olamazsın daha : " + (60 - yas) + "yil calismalisisn");
            } else {
                System.out.println("Emekli olabilirsin");
            }
        } else if (cinsiyet == 'e' || cinsiyet == 'E') {
            if (yas < 15) {
                System.out.println("Hatalı yas girisi");
            } else if (yas < 60) {
                System.out.println("Emekli olamazsın daha : " + (60 - yas) + "yil calismalisisn");
            } else {
                System.out.println("Emekli olabilirsin");
            }
        }else {
            System.out.println("hatali giris");
        }

}}