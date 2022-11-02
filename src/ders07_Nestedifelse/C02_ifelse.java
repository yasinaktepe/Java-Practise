package ders07_Nestedifelse;

import java.util.Scanner;

public class C02_ifelse {
    public static void main(String[] args) {

        //Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        //​Musteri karti varsa 10 urunden fazla alirsa %20,
        // yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla alirsa %15,
        // yoksa %10 indirim yapin
        Scanner scan = new Scanner(System.in);
        System.out.println("Kac tane aldiniz");
        System.out.println("Tanesi ne kadar");
        int aded = scan.nextInt();
        double taneFiyati = scan.nextDouble();
        double toplamUcret = taneFiyati * aded;

        System.out.println("Musteri kartiniz var mi? Var ise 'E' yok ise 'H' tiklayiniz");
        char musteriKartiVarMiYokMu = scan.next().charAt(0);

        if(musteriKartiVarMiYokMu == 'E'){
            if(aded>10){
                toplamUcret *= 0.8;
            }else{
                toplamUcret *= 0.85;
            }
            System.out.println("Toplam borcunuz: " + toplamUcret);
        }else if (musteriKartiVarMiYokMu == 'H'){
            if(aded>10){
                toplamUcret *= 0.85;
            }else{
                toplamUcret *= 0.9;
            }
            System.out.println("Toplam borcunuz: " + toplamUcret);

        }else{
            System.out.println("Yanlis tuslama yaptiniz");
        }


    }
}
