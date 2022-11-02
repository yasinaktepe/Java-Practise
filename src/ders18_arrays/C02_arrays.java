package ders18_arrays;

import java.util.Arrays;

public class C02_arrays {
    public static void main(String[] args) {

        String [] arr={"Ali", "Ulus", "Nesrin"};

        //bu arrayin tum elementlerini aralarinda bir bosluk birakarak yazdiralim

        for (int i = 0; i <arr.length ; i++) {

            System.out.print(arr[i]+ " ");

        }

        //bu array i array olarak yazdiralim

        System.out.println(arr);
        //array bir obje non-primitive data oldugundan java referansinin yazdirir
        //Array i array olarak yazdirmek isterseniz Arrays class indan yardim almalisiniz

        System.out.println(Arrays.toString(arr)); // [Ali, Ulus, Nesrin]

    }
}
