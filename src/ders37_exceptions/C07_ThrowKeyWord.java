package ders37_exceptions;

import java.util.Scanner;

public class C07_ThrowKeyWord {
    public static void main(String[] args) {
        //Kullanicidan yasini isteyin
        //eger 0 veya negatif bir sayi girerse
        //uyari olarak IllegalArgumentException uyarisi verin
        //ancak kodunuz normal calismaya devam etsin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas= scan.nextInt();

        if (yas<=0){

            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                System.out.println("Yas 0 veya negatif olamaz");
            }
        }
    }
}
