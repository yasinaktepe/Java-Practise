package ders06_ifElsestatment;

import java.util.Scanner;

public class C03_ifelsestatements {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen ucgenin 3 kenarini giriniz");
        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();

        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("Eskenar Ucgen");
        } else {
            System.out.println("Eskenar Ucgen Degil");
        }


























    }
}


