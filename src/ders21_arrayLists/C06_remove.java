package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_remove {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 3, 5, 3, 5, 2, 5, 1, 2, 4, 5, 3, 4, 5};

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            sayilar.add(arr[i]);
        }

        sayilar.remove(2);
        System.out.println(sayilar);
        sayilar.remove(5);
        System.out.println(sayilar);

        /*listemiz İnteger lardan olusuyorsa
        biz int bir deger yazdigimizda hep index kabul ettiginden
        istedigimiz elmenti oble olarak girip sildirmek icicn
        obceden tanımlamamiz gerekir
         */


        Integer silinecekObje=4;
        sayilar.remove(silinecekObje);
        System.out.println(sayilar);

        // tum ucleri sildirirn

        silinecekObje=3;

        while (sayilar.contains(silinecekObje)){

            sayilar.remove(silinecekObje);


        }


        System.out.println(sayilar);










    }
}
