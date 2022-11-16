package ders36_checkedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class C01_IOExceptions {
    public static void main(String[] args) throws FileNotFoundException {


        FileInputStream fis= new FileInputStream("src/ders36_checkedExceptions/Deneme.txt");

        FileOutputStream fos = new FileOutputStream("src/ders36_checkedExceptions/Deneme.txt");

        //Java ile bilgisayarımızdaki bir dosyayya ulasmak istersek
        //FileInputStream class indan obje olusturup
        //o obje ile dosyayi kullanabiliriz

        //fis olustururken ulasmak istedigimiz dosyayin dosya yolunu parametre olarak girmeliyiz

        /*
        Checked exception olusturna ihtimali olan kodlari yazdigimizda
        java compile time orada bir hata ihtimali oldugunu gorur
        ve kodun altini kırmizi olarak cizer

        bu durumda kirmizi cizgyi kaldirmak icin 2 yontem vardir
        1- exception ı try catch blogu ile handle etmek
        2- javaya sorun ihtimalinin farkinda oldugumuzun ama kodumuza guvendigimizi
         ve calismaya devam etmesini istedigimizi soylemek
         bunun ici metod signature ınıa method deklarasyonu ile curly braces arasina
         throws keyword ve beklenen exception turu yazilabilir
         */
    }
}
