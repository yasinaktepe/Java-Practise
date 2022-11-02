package ders17_scope;

import java.util.Scanner;

public class C05_objectClass {
    public static void main(String[] args) {

        //C03 class indaki instance variablelara nasil ulasabiliriz
        //instance variable larin diger adi obje variablelaridir.
        //instance variablelara obje uzerinden ulasabiliriz

        Scanner scan=new Scanner(System.in);

        C03_ObjectVariables pers1=new C03_ObjectVariables();

       // System.out.println(pers1.persIsmi);//Isım girilmedi
       // System.out.println(pers1.persYasi);//0

        pers1.persIsmi="Suleyman";
        pers1.persYasi=35;
        pers1.persTelefonu="555.3456754";

        C03_ObjectVariables pers2=new C03_ObjectVariables();
        pers2.persIsmi="Latife";
        pers2.persYasi=32;
        pers2.persTelefonu="555.4322321";

        System.out.println(pers1.persIsmi);//Suleyman
        System.out.println(pers2.persIsmi);//Latife

        C03_ObjectVariables pers3= new C03_ObjectVariables();
        pers3.persIsmi="Heysem";
        pers3.persYasi=30;
        pers3.persTelefonu="312 2134567";

        System.out.println(pers1.persYasi);//35
        System.out.println(pers2.persYasi);//32
        System.out.println(pers3.persYasi);//30

    }
}
