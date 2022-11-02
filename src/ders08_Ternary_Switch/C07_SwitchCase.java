package ders08_Ternary_Switch;

import java.util.Scanner;

public class C07_SwitchCase {
    public static void main(String[] args) {
        //J : Java
        //D : Development
        //K: Kit
        //kullanıcidan bir harf alin, alinan harf j,,d,k dan birisi ise yukarıdaki kelimelerden biri ise
        //JDK yazdırın, degilae gecersiz harf yazdirin

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir harf girin");
        char harf=scan.next().charAt(0);

        switch (harf){
            case 'J' :
            case 'j' :
                System.out.println("JAVA");
                break;
            case'D' :
            case 'd':
                System.out.println("Development");
                break;
            case 'K' :
            case 'k' :
                System.out.println("KIT");
                break;
            default:
                System.out.println("Gecersiz harf");
        }









    }
}
