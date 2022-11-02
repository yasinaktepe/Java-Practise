package ders08_Ternary_Switch;

public class C05_NestedTernary {
    public static void main(String[] args) {
       // kullanicidan bir tamsayi alin. Sayi pozitifse, cift sayi veya cift sayi degil

        int sayi=20;

        if(sayi>0){
            System.out.println(sayi%2==0 ? "Cift Sayi" : "Cift Sayi Degil");




        }else{
            System.out.println(sayi<-99 && sayi>-1000 ? "Uc basamakli" : "Uc basamaklı degil");

        }


        String sonuc= sayi>0
                ?
                sayi%2==0 ? "Cift Sayi" : "Cift Sayi Degil"
                :
                sayi<-99 && sayi>-1000 ? "Uc basamakli" : "Uc basamaklı degil";









    }
}
