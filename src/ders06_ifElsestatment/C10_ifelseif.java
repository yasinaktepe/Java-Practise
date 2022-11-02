package ders06_ifElsestatment;

public class C10_ifelseif {
    public static void main(String[] args) {

        char cinsiyet = 'E';
        int yas = 60;

        if (cinsiyet == 'e' && yas >= 65) {
            System.out.println("emekli olabilirsin");
        } else if (cinsiyet == 'e' && yas < 65) {
            System.out.println("emekli olmak icin  daha " + (65 - yas) + " sene calısmalisin");
        } else if (cinsiyet == 'k' && yas < 60) {
            System.out.println("emekli olmak icin daha " + (60 - yas) + "sene calismalisin");

        } else if (cinsiyet == 'k' && yas >= 60) {
            System.out.println("emekli olabilirsin");

        } else {
            System.out.println("gecersiz giris");
        }

    }
}
