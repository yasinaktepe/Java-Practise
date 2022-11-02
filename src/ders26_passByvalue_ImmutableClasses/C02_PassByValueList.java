package ders26_passByvalue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C02_PassByValueList {
    public static void main(String[] args) {

        // bir method olusturalim ve method'da list'deki sayilari 5 artiralim
        // ve method'da listenin son halini yazdiralim

        List <Integer> sayilar= new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);

        elementleri5Arttir(sayilar);


        //method call sonrasi main metod içerisinde List i tekrar yazdiralim.

        System.out.println(sayilar);
    }

    public static void elementleri5Arttir(List<Integer> sayilar){

        for (int i = 0; i <sayilar.size() ; i++) {

            sayilar.set(i,sayilar.get(i)+5);

        }

        System.out.println(sayilar);
    }
}
