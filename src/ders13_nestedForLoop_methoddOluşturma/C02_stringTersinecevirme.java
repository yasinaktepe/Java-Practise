package ders13_nestedForLoop_methoddOluşturma;

public class C02_stringTersinecevirme {
    public static void main(String[] args) {
       // Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.

        String input= "Java her gecen gun guzellesiyor";
        String tersinput="";

        for (int i = input.length()-1; i >=0 ; i--) {

            tersinput+= input.substring(i,i+1);

        }

        System.out.println("Ters hali: " + tersinput);







    }
}
