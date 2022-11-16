package ders33_InheritanceDataTypeKullanimi_Overriding;

public class FAvciKuslar extends EKuslar{

    public void hareket(){
        System.out.println("Avci kuslar ucarlar");
    }
    public void beslenme(){
        System.out.println("Avci kuslar et yerler");
    }

    public void pence(){
        System.out.println("Avci kuslar pencelidir");
    }
    public void gaga(){
        System.out.println("Avci kuslar sivri gagalidir");
    }

    public static void main(String[] args) {


        FAvciKuslar avci1= new FAvciKuslar();
        /*
        Bir obje olusturulurken constructor ve data turu ayni ise hangi method un gecerli
        oldugunu bulmak icin o class a gider varsa kullaniriz
        yoksa sirasi ile parentlara gider ilk buldugumuzu kullaniriz
         */

       avci1.beslenme(); //AvciKuslar
       avci1.gaga(); //AvciKuslar
       avci1.pence(); //AvciKuslar
       avci1.hareket(); //AvciKuslar
       avci1.cogalma(); //EKuslar
       avci1.kanat(); //EKuslar
       avci1.omur(); //DHayvanlar
       avci1.solunum(); //Ekuslar

        EKuslar avci2=new FAvciKuslar();

        /*
        bir obje olusturulurken data turu ile constructor farkli ise hangi metodun gecerli olacagini
        bulmak icin

        Once data turunun oldugu class ve parent larina bakarak o method u buluruz
        bulamazsak CTE verir

        bulursak HEMEN CALISTIRMAYIZ
        calistirmadan once o method override edilmis mi kontrol ederiz
        override edilmisse override eden methodu cagiririz
         */

        avci2.beslenme(); //FAvciKuslar
        avci2.gaga(); //AvciKuslar
        //avci2.pence(); //CTE
        avci2.hareket(); //AvciKuslar
        avci2.cogalma(); //EKuslar
        avci2.kanat(); //EKuslar
        avci2.omur(); //DHayvanlar
        avci2.solunum(); //Ekuslar

        DHayvanlar avci3= new FAvciKuslar();

        avci3.beslenme(); //FAvciKuslar
        //avci3.gaga(); //CTE
        //avci3.pence(); //CTE
        avci3.hareket(); //AvciKuslar
        avci3.cogalma(); //EKuslar
        //avci3.kanat(); //CTE
        avci3.omur(); //DHayvanlar
        avci3.solunum(); //Ekuslar



        EKuslar kus1= new EKuslar();
        kus1.cogalma(); //Kuslar
        kus1.gaga(); //Kuslar
        kus1.kanat(); //Kuslar
        kus1.hareket(); // Hayvanlar
        kus1.solunum(); //Kuslar
        kus1.beslenme(); //Hayvanlar
        kus1.omur(); //Hayvanlar

        /*
        methodlarla belirlenen ozellikler en guncel bilgiyi bulurken
        variable ile belirlenen ozellikler ilk buldugu degeri kullanir

        bunun icin methodlara dinamik ozellik variable a statik ozellik denir
         */

        DHayvanlar kus2=new EKuslar();

        kus2.cogalma(); //Kuslar
        //kus2.gaga(); //CTE
        //kus2.kanat(); //CTE
        kus2.hareket(); // Hayvanlar
        kus2.solunum(); //Kuslar
        kus2.beslenme(); //Hayvanlar
        kus2.omur(); //Hayvanlar

    }
}
