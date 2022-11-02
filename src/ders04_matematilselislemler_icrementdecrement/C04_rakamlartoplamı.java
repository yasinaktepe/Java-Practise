package ders04_matematilselislemler_icrementdecrement;

public class C04_rakamlartoplamı {
    public static void main(String[] args) {

        //kullanıcının girdigi dort basamaklı sayının rakamlar toplamı


        int input = 1453;
        int birlerbasamagı=0;
        int rakamlartoplamı=0;

        birlerbasamagı = input % 10; //3
        rakamlartoplamı=rakamlartoplamı+birlerbasamagı;
        input = input/10;

        birlerbasamagı = input % 10; //3
        rakamlartoplamı=rakamlartoplamı+birlerbasamagı;
        input = input/10;

        birlerbasamagı = input % 10; //3
        rakamlartoplamı=rakamlartoplamı+birlerbasamagı;
        input = input/10;

        birlerbasamagı = input % 10; //3
        rakamlartoplamı=rakamlartoplamı+birlerbasamagı;
        input = input/10;

        System.out.println(rakamlartoplamı);



































    }
}
