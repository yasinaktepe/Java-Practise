package ders30_encapsulation;

public class C01_Encapsulations {
    public static void main(String[] args) {

        AEncapsuleClass pers1=new AEncapsuleClass();

        //pers1.hastaneIsmi="Java Hastanesi"; private oldugu icin gorulemez

       // pers1.hastaUcreti=10000; private oldugu icin kullanilamaz

        //pers1.hemsireAdresi="Ankara";
        //pers1.hemsireIsmi="Yildiz Yildiz";

        System.out.println(pers1.getHastaneIsmi());

        pers1.setHastaUcreti(500);

        //getter ve setter metodları
        //bazen de erişimi sinirlandirmak icin degil
        //kullanicilarin islevi iyi anlamasi icin kullanilir

        System.out.println(pers1.getHemsireAdresi());
        pers1.setHemsireAdresi("Istanbul");
        System.out.println(pers1.getHemsireIsmi());
        pers1.setHemsireIsmi("Emel");
        System.out.println(pers1.getHemsireIsmi());
        System.out.println(pers1.getHemsireAdresi());


    }
}
