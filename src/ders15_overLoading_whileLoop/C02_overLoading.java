package ders15_overLoading_whileLoop;

public class C02_overLoading {

    public static void main(String[] args) {

        carpim(3,5);
        carpim(3.4,2);
    }
    //Bir class da aynı isim ve ayni signature a sahip iki method olmaz
    public static void carpim(int sayi1,int sayi2){
        System.out.println("iki integer sayinin carpimi: "+sayi1*sayi2);
    }
    public static void carpim(int sayi3,int sayi4,int sayi5) {
        System.out.println("Uc integer sayinin carpimi: " + sayi3*sayi4*sayi5);
    }
    public static void carpim(double sayi1,int sayi2){
        System.out.println("Double-integer sayinin carpimi: "+sayi1*sayi2);
    }
    public static void carpim(int sayi1,double sayi2){
        System.out.println("integer-double sayinin carpimi: "+sayi1*sayi2);
    }
    public static void carpim(double sayi1,double sayi2){
        System.out.println("Iki double sayinin carpimi: "+sayi1*sayi2);
    }
}
