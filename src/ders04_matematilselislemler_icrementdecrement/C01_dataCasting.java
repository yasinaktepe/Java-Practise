package ders04_matematilselislemler_icrementdecrement;

public class C01_dataCasting {

    public static void main(String[] args) {

        int sayi1=20;
        int sayi2=6;

        System.out.println(sayi1/sayi2); //3,33333333333333333

        //bolunen ve bolen ikiside tamsayı ise java sonucu sadece tam sayı kısmını alır

        double sayi3=6;

        System.out.println(sayi1/sayi3); //java genis olana gore davranir
    }
}
