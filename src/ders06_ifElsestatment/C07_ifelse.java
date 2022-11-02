package ders06_ifElsestatment;

import java.util.Scanner;

public class C07_ifelse {

    public static void main(String[] args) {
        //Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
        // olarak yazdirin, yoksa girilen harfi yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char krk = scan.next().charAt(0);

        if(krk>='a' && krk<='z'){
            System.out.println((char)(krk-32));
        }else{
            System.out.println(krk);
        }

    }
}
