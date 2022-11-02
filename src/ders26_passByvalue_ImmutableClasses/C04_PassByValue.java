package ders26_passByvalue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValue {
    public static void main(String[] args) {
        //bir metod olusturalim
        //method da yeni bir list e olusturun
        //Listeye sayilar listesindeki degerlerin 5 fazlasini element olarak atayin
        //sonra sayilar listesine deger olarak yeni list i atayin
        //ve sayilar list ini yazdirin

        List<Integer> sayilar= new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
    }


}
