package ders07_Nestedifelse;

import java.util.Scanner;

public class C01_ifelse {
    public static void main(String[] args) {

        //​Soru 2- Kullanicinin kilo(kg) ve boyunu(cm)
        // isteyip vucut kitle endeksini hesaplayin (kilo*10000 /
        // (boy *boy)) vucut kitle endeksi 30’dan buyukse obez,
        // 25-30 arasi ise kilolu,

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kg olarak kilonuzu giriniz");
        double agirlik= scan.nextDouble();
        System.out.println("cm olarak boyunuzu giriniz");
        double boy=scan.nextDouble();

        double vke=(agirlik*10000)/(boy*boy);
        System.out.println("Vucut kitle endeksiniz : " + vke);

        if(vke>30){
            System.out.println("obez");
        } else if (vke>25) {
            System.out.println("kilolu");

        } else if (vke>20) {
            System.out.println("normal");

        }else{
            System.out.println( "yanlis giris");
        }


    }
}
