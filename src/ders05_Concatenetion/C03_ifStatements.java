package ders05_Concatenetion;

import java.util.Scanner;

public class C03_ifStatements {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz");
        int s1=scan.nextInt();
        int s2= scan.nextInt();

        if (s1 > 100) {

            System.out.println("ilk sayi 100 den buyuk");
        }
        if (s2%2==0) {
            System.out.println("ikinci sayi cift sayidir");
        }

        if (s1>s2){

            System.out.println("ilk sayi daha buyuk");
        }
















































    }
}
