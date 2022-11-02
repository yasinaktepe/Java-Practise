package ders19_arrays;

import ders18_arrays.C03_ArrayElementleriniArtırma;
import ders18_arrays.C04_ArrayElementleriToplami;
import ders18_arrays.C05_ArraydaElemanArama;
import ders18_arrays.C06_KullaniciyaArrayOlusturma;

import java.util.Arrays;

public class C03_Methodlarikullanma {
    public static void main(String[] args) {


        //verilen bir int array in elementlerini 2 arttirin

        int[] arr={2,3,4};
        arr=C03_ArrayElementleriniArtırma.elementleri2Artir(arr);

        System.out.println(Arrays.toString(arr));

        //arr array inin elementleirni toplayin sonucu yazdirin

        System.out.println(C04_ArrayElementleriToplami.pozitifElementleriTopla(arr));

        // arr arrayinde 10 element olarak var mi?

        C05_ArraydaElemanArama.elemanAra(arr,10);

        // kullanicidan deger alarak bir array olusturun

        int[] yeniArr=C06_KullaniciyaArrayOlusturma.arrayOlustur();

        System.out.println(Arrays.toString(yeniArr));


    }
}
