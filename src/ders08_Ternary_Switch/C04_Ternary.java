package ders08_Ternary_Switch;

public class C04_Ternary {
    public static void main(String[] args) {
        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        // “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        int kenar1=10;
        int kenar2=10;
        int kenar3=10;

        System.out.println(kenar1==kenar2 && kenar2==kenar3 ? "Eskenar Ucgen" : "Eskenar ucgen degil");

        //iki sayı alın buyuk olmayan sayıyı yazdırın

        int sayi1 =10;
        int sayi2 =11;
        System.out.println(sayi1>sayi2 ? sayi2 : sayi1 );
    }
}
