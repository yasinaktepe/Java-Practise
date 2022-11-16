package ders34_overriding_poilymorphism;

public class BChild extends AParent{

    public void method1(){
        System.out.println("child class method1");
    }
    public void method2(){
        //overriding olabilmesi icin
        //hem metod ismi, hemde method signature ayni olmali
        System.out.println("child class method2");
    }

    public void method2(String isim){

        System.out.println("child class String parametreli class");
    }

    @Override
    public void method3() {
        // super.method3();
        //Overriding varsa parent ve child class daki
        //overriden ve overriding methodlardan sadece biri calisir
        //eger ikisini birden calıitirmak isterseniz
        //super.overridenMethodismi yazilir

        /*
        Overriding method @override notasyonu ile isaretlenebilir
        @Override kullailmayan overriding isleminde
        parent class daki verridden method silinirse hic bir sorun olmaz

        Ancak @Override kullailmayan overriding isleminde,
        parent class daki verridden method silinirse veya signature i degistirilirse
        Java CTE verir
        boylece overriden methodun silinmesi engellenir
         */







    }

}
