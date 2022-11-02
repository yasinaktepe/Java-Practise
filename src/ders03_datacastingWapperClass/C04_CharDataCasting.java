package ders03_datacastingWapperClass;

import java.util.Scanner;

public class C04_CharDataCasting {

    public static void main(String[] args) {

        System.out.println('a' + 'b');// 97+98=195

        //kullanıcından char bir karakter alın o karakterden sonra gelen üç karakteri yazdirin
        //ornek input : a , output :bcd

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz");

        char girilenkrk = scan.next().charAt(0);

        System.out.println(""+(char)(girilenkrk+1) + (char)(girilenkrk+2)+(char)(girilenkrk+3));


























    }
}
