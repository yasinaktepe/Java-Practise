package ders17_scope;

public class C01_LocalVariables {
    public static void main(String[] args) {
        //bir metodun icersinde olusturulan variablelarin scope u
        //icinde olusturulduklari method dur.
        //o method un dısından ulasilamazlar

        int sayi=10;
        String isim="Ramazan";
       // System.out.println(dogruMu);

        for (int i = 0; i <10 ; i++) {
            String adres ="Ankara";
         //bir loop iceriisinde olusturulab variable lar sadece o loop icerisinde gecerlidir.
        }

       // System.out.println(adres);

        double pi;

       // System.out.println(pi);
        //local variable lar deger atamadan olustrulabilir ancak kullanılamaz
        //kullanmadan once deger atanmis olmalidir.

    }

    public static void method1(){
      //  System.out.println(sayi);
      //  isim="tugay";

        boolean dogruMu=true;
    }
}
