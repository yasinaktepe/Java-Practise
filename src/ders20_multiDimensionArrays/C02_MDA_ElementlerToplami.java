package ders20_multiDimensionArrays;

public class C02_MDA_ElementlerToplami {
    public static void main(String[] args) {

        int[] arr1={3,5,7,8}; //23

        int toplam=0;

        for (int i = 0; i <arr1.length ; i++) {
            toplam+=arr1[i];
        }
        System.out.println("Tek katli elementler toplami : " + toplam);

        int[][] arr={{1,2},{3,4,5},{7}};
        //elementleri toplayalim

        toplam=0;

        for (int i = 0; i <arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++){

                toplam+=arr[i][j];

            }


        }

        System.out.println("Iki katli arrayin elementleri toplami : " + toplam); //22
    }
}
