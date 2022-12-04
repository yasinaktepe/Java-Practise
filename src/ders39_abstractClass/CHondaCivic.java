package ders39_abstractClass;

public class CHondaCivic extends BHonda {
    @Override
    public void motor() {
        System.out.println("Honda civic araclar vtec teknolojili cevreci motor kullanir");
    }

    @Override
    public void kasa() {
        System.out.println("Civic araçlar sedan veya hb kasa kullanir");

    }

    @Override
    public void tekerlek() {
        System.out.println("Civic araclar 205*16*55 teker kullanir");

    }

    @Override
    public void yakit() {

        System.out.println("Civic aracalar benzinlidir");
    }

    @Override
    public void guvenlik() {
        System.out.println("Civic araclar guvenlik standartina uyar");

    }

    @Override
    public void abs() {
        System.out.println("Honda civic arabalar standart abs kullanir");
    }

    @Override
    public void klima() {
        System.out.println("Honda civic arabalar standart klima kullanir");
    }

    public static void main(String[] args) {

        /*
        Abstract parent class lardaki abstract metodlar
        concrete chil class lar tarafindan mecburen override edilir

        Ancak abstract parent lardaki concrete metodlari override etmek
        mecburi degildir.
        Eger child class a uyarlamak isterseniz override edebilirsiniz
        veya override etmeyip parent class daki haliyle kullanabilirsiniz
         */
        CHondaCivic civic1=new CHondaCivic();
        civic1.abs(); //Araba
        civic1.klima(); //Araba
        civic1.marka(); //Honda
        civic1.ozelTeknoloji(); //Honda
    }
}
