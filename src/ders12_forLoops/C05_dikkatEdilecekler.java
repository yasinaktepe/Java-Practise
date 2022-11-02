package ders12_forLoops;

public class C05_dikkatEdilecekler {
    public static void main(String[] args) {

        /*Sonsuz loop

            for (int i = 0; i >=-10 ; i++) {
                System.out.println(i + "");
             }

         */
         //ilk deger icin bitis sarti true olmuyorsa for body si devreye girmez
        for (int i = 0; i >10 ; i++) {

            System.out.println(i);

        }

        //bir loop u sonunu beklemeden bitirmek istersek

        //kullaniciin verdigi bir sayının asal sayı olup olmadigi bulun

        int sayi=50;
        int bayrak=0;

        for (int i = 2; i <sayi-1 ; i++) {

            if(sayi%i==0){
                bayrak++;

            }

        }
        System.out.println(bayrak);

        if(bayrak==0){
            System.out.println("asal sayi");
        }else{
            System.out.println("asal sayi degil");
        }






    }
}
