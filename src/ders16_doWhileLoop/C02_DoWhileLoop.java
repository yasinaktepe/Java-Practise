package ders16_doWhileLoop;

public class C02_DoWhileLoop {
    public static void main(String[] args) {
        //10,11,12 sayılarını toplayan bir while loop olusturalım

        int sayi=10;
        int toplam=0;

        do {
            toplam=toplam+sayi;

            sayi++;
        }while(sayi<=12);

        System.out.println(toplam);

        /*do while loop un 2 avantajı vardir
        1-loop body si en az 1 kere calisir
        (while loop da baslangic degeri uygun degilse loop bodysi calismayabilir)
        2-while bitis kontrolu loop kadar calisir.
        (while loop da bir kere fazla calisirdi)
         */











    }
}
