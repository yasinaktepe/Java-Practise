package ders12_forLoops;

public class C04_rakamlarToplami {
    public static void main(String[] args) {

        //kullanıcının verdigi sayinini rakamlar toplaminin bulun

        int sayi=484318946;

        String sayiStr=""+sayi;

        int birlerbasamagı=0;
        int rakamlartoplami=0;

        for (int i = 1; i <=sayiStr.length() ; i++) {

            birlerbasamagı=sayi%10;
            rakamlartoplami=rakamlartoplami+birlerbasamagı;
            sayi=sayi/10;

        }

        System.out.println(rakamlartoplami);
    }
}
