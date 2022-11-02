package ders17_scope;

public class C04_ClassVaiables {

    public static void main(String[] args) {
        //c03 deki hastane ismini yazdirmak istesek
        System.out.println(C03_ObjectVariables.hastaneismi);//Yildiz hastanesi

        System.out.println(C03_ObjectVariables.hastaSayisi);//23453

        C03_ObjectVariables.hastaSayisi++;
        C03_ObjectVariables.hastaSayisi++;
        method1();

        System.out.println(C03_ObjectVariables.hastaSayisi);//23456

    }//kod takibi main methoddan baslar main metodun sonuna gelindiginde
    //hersey biter.tum degisimler resetlenir
    //variable degerleri bastaki hallerine doner
    public static void method1(){
        C03_ObjectVariables.hastaSayisi++;


    }

    /*Java runtime programdir.
    calismaya basladiginda variablelara atanan degerleri ister
    calistigi muddtce yapilan degisikleri kaydeder
    ama calismasi bittiginde degerleri sifirlar
     */
}
