package ders10_stringManipulation;

public class C09_soru {
    public static void main(String[] args) {
        //Kullanicidan bir cumle ve bir metin alin cumlede metin durumuna gore
        //asagıdakilerden uygun olanı yazdirin
        //1- cumle metni icermiyor
        //2-cımle metni 1 kere iceriyor
        //3-cumle metni birden fazla iceriyor

        String cumle="Java cok guzeldir cok";
        String metin="cok";


        int ilkindex=cumle.indexOf(metin);
        int sonindex=cumle.lastIndexOf(metin);

        if(ilkindex==(-1)){
            System.out.println("cumle metni içermiyor");

        }else if(ilkindex==sonindex){
            System.out.println("cumle metni 1 kere iceriyor");
        }else{
            System.out.println("cumle metni birden fazla iceriyor");
        }
































    }
}
