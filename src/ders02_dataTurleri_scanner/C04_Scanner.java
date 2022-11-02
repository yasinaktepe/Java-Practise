package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C04_Scanner {


    public static void main(String[] args) {

        //Kullanıcıdan ismini alip buyuk harflerle yazdır

        //1.adım scan objesi oluşturma

        Scanner scan = new Scanner(System.in);

        //2.adım kullanıcıya ne istediğinizi yazdırma
        System.out.println("Lutfen adinizi giriniz");

        //3.adım kullanıcıdan istediğimiz bilginin turune gore vbir variable oluşturup
        //          scanner methodlarından uygun olaninin kullanarak degeri variable a atayalım

        String kullaniciAdi = scan.next();

        System.out.println(kullaniciAdi.toUpperCase());


    }
}
