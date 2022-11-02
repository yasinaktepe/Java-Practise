package ders19_arrays;

import java.util.Arrays;

public class C08_ArrayeElemanEklemeMetodu {
    public static void main(String[] args) {

        //verilen bir int array e istenen bir elmenti ekleyip
        //yeni halinini bize donduren bir metod olusturun

        int[] abc={3,5,8,9};
        int eklenecekSayi=1;


        abc=arrayeElemanEkleme(abc,eklenecekSayi);

        System.out.println(Arrays.toString(abc)); //[3, 5, 8, 9, 1]
    }

    public static int[] arrayeElemanEkleme(int[] eklenecekArr, int eklenecekSayi){

        int[] yeniArr=new int[eklenecekArr.length+1];

        for (int i = 0; i <eklenecekArr.length ; i++) {

            yeniArr[i]=eklenecekArr[i];

        }

        yeniArr[yeniArr.length-1]=eklenecekSayi;

        return yeniArr;
    }
}
