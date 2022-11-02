package ders11_stringManipulation;

public class C01_nullPointer {
    public static void main(String[] args) {

        String str1="";
        //str1 e deger atanmistır

        System.out.println(str1);
        System.out.println(str1.concat("JAva"));

        String str2;
        //str2 olusturuldu ama deger atanmadı
        //System.out.println(str2);  // str2 ye deger atanmadığından yazdırılamaz

       // System.out.println(str2.concat("Java")); // deger atanmadıgı icin metodla kullanılamaz

        str2="Java candir";
        System.out.println(str2);

        String str3=null; //str3 deger atanmamistir
                          // null pointer ile javaya deger atamadıgizin farkinda oldugumuzu soyluyoruz
        System.out.println(str3);// null

        //System.out.println(str3.concat("Java")); //NullpointerException

        System.out.println(str3+"Java");//nullJava

        //System.out.println(str3.toUpperCase());    //NullpointerException


    }
}
