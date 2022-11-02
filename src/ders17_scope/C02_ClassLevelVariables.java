package ders17_scope;

public class C02_ClassLevelVariables {

    //class level variable lar methodlarin disinda olusturulur
    //genel kullanim en ustte olusturulmalidir.
    static String hastaneismi="Yildiz hastanesi";
    static int hastaSayisi=23453;
    static String basHekimIsmi;
    String persIsmi="Isım girilmedi";
    String persTelefonu="Telefon girilmedi";
    int persYasi;

    public static void main(String[] args) {
        System.out.println(hastaneismi); //Yildiz hastanesi
        System.out.println(basHekimIsmi);//null
       // System.out.println(persIsmi);//static olmadigi icin static main method kullanilamaz
        /*
        class level variable lara deger atamasi yapilmamis olursa
        Java bu variable lara data turune gore
        default olarak tanimlanan degerleri atar
        default degerler
        sayisal variable lar:0
        boolean:faulse
        char:''
        objeler(string sahil):null
         */
    }




    public static void method1(){
        System.out.println(hastaSayisi);
        hastaSayisi++;
       // System.out.println(persIsmi);

    }

    public void method2(){
        System.out.println(hastaneismi);
        hastaSayisi++;
        System.out.println(persIsmi);//Isım girilmedi
        System.out.println(persYasi);//0


    }

}
