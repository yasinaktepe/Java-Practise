package ders08_Ternary_Switch;

public class C02_Ternary {
    public static void main(String[] args) {

        String str1="Ali";
        String str2="ali";

        //verilen iki metin birbriyle ayni ise metinler ayni
        //farklı ise metinler farkli yazdirin


        if(str1.equals(str2) ){
            System.out.println("Metinler ayni");
        }else{
            System.out.println("Metinler farkli");
        }

        System.out.println(str1.equals(str2) ? "Metinler aynı" : "Metinler farkli");








    }
}
