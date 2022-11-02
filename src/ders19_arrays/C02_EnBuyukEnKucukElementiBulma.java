package ders19_arrays;

import java.util.Arrays;

public class C02_EnBuyukEnKucukElementiBulma {
    public static void main(String[] args) {
        //verilen bir int array de ne kucuk ve en en buyuk sayilari yazdiran bir metod olusturun

        int[] arr={3,8,1,5,2,9};
        enBuyukEnKucukElementyazdir(arr);
    }
    public static void enBuyukEnKucukElementyazdir(int[] arr){

        Arrays.sort(arr); //[1, 2, 3, 5, 8, 9]

        System.out.println("En buyuk element : " + arr[arr.length-1]);
        System.out.println("En kucuk element : " + arr[0]);

    }
}
