package ders06_ifElsestatment;

import java.util.Scanner;

public class C04_ifelse {
    public static void main(String[] args) {

        //Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Bir Karakter giriniz");
        char krk=scan.next().charAt(0);

        if(krk>='A' && krk<='Z'){
            System.out.println("Buyuk Harf");
        }else {
            System.out.println("Buyuk Harf Degil");
        }






















    }
}
