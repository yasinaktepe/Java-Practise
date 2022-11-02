package ders11_stringManipulation;

public class C04_replaceAll {
    public static void main(String[] args) {
        //kullanicinin girdigi metinde
        //harf dısında kalan tum karakterleri temizleyen bir kod yazin
        //not: space silinmemeli

        String input="Ja5+va cok 1*guzel";


        input=input.replaceAll("\\d","");
        input=input.replace(" ","5");
        input=input.replaceAll("\\W","");
        input=input.replace("5"," ");



        System.out.println(input);



















    }
}
