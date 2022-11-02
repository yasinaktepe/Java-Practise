package ders08_Ternary_Switch;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {

        //kullanıcıdan bir sayı alın
        //sayı pozitif ise 2 katını yazdirirn
        //poz degilse sayiya 10 ekleyip yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz");
        double sayi= scan.nextDouble();

        if(sayi>0){
            System.out.println(sayi*2);

        }else{
            System.out.println(sayi+10);
        }


        System.out.println(sayi>0 ? 2*sayi : sayi+10);






    }
}
