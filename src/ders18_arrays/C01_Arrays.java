package ders18_arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        int[] arr1={2,4,6,8,10};

        //array in bir elemana ulaşmak ve update etmek icin

        System.out.println(arr1[2]);//6

        arr1[3]=20;

        System.out.println(arr1[3]);//20

        System.out.println(arr1.length);//5

        //son elementi yazdirin

        System.out.println(arr1[arr1.length-1]);

        //tüm elementler

        for (int i = 0; i <arr1.length ; i++) {
            System.out.print(arr1[i]);

        }

        //arrayin uzunlugu sonradan degistilmez
        //eger array e olmayan bir index e atama yapmak isterseniz
        //arrayındexourofboundsexception
        //bu hata Compile time Error değil Run Time Error dur

        // arr1[5]=35;

    }
}
