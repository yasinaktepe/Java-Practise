package ders35_exceptions;

import java.util.Scanner;

public class C03_ArrayIndexOutOfBoundsExceptions {
    public static void main(String[] args) {
        //Kullanicidan bir index isteyin
        //verilen bir array dn kullanicinin girdigi index deki elementi yazdirin

        int[] arr= {3,4,6,7,8,2,3,5,6,8,9,1};

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir index giriniz");
        int index= scan.nextInt();


        try {

            System.out.println(arr[index]);

        } catch (ArrayIndexOutOfBoundsException hata) {

            System.out.println(hata.getMessage());
            hata.printStackTrace();

            //java.lang.ArrayIndexOutOfBoundsException: Index 44 out of bounds for length 12
            //	at ders35_exceptions.C03_ArrayIndexOutOfBoundsExceptions.main(C03_ArrayIndexOutOfBoundsExceptions.java:19)
            // javanin yazdigi tum hata mesajini veir ama kodlar calismaya devam eder


            //catch blogunda hicbir kod olmasada kodlarimiz normal calismaya devam eder
            //catch blogunda kullaniciya yazdiracagimiz mesaj
            //tamamen kod yaznin insiyatifindedir
            //exception class dan hazir hata mesajı yazdirabililriz
        }
    }
}
