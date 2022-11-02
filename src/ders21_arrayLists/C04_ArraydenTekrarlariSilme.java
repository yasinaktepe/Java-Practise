package ders21_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArraydenTekrarlariSilme {
    public static void main(String[] args) {
        //verilen bir arrray deki tgekrar eden sayilari bir kere olacak şekilde
        //array i düzenleyin

        int[] arr={1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};

        //bu soruyu array le yapmak cok zor
        //bunun yerine bu array in elemanlarinin tek tek inceleyip
        //tekrarsız olanlari bir list e atalim
        //en son o list deki elmentleri iceren bir array olusturup
        //yeni array i eski array e deger olarak atayalim

        List<Integer> tekrarsizliste=new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            if (!tekrarsizliste.contains(arr[i])){
                tekrarsizliste.add(arr[i]);
            }

        }

        System.out.println("tekrarsiz liste : " + tekrarsizliste);

        arr=new int [tekrarsizliste.size()];

        for (int i = 0; i < arr.length ; i++) {

            arr[i]=tekrarsizliste.get(i);



        }

        System.out.println(Arrays.toString(arr));

    }
}
