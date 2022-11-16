package ders34_overriding_poilymorphism;

public class DChild extends CParent {

    //Overriding kurallari
    //1-access modifier method signature a dahil olmadigindan
    //overriden ve overriding access modifier lar farkli olabilir
    // child parent i sinirlandiramaz
    // yani overriding method un access modifier i
    // ayni daha genis kapsamli olmalidir
    // private -- default -- protected -- public

    public void method1(){

    }

    //2- private ve static methodlar override edilemez
    //ayni isimde method olusturulunca java CTE vermez
    //ancak @override isareti cikmaz ve
    //@override notasyonu kullanilmak istenirse CTE olur
    //Yani Java bunlari farkli class lardaki farkli methodlar olarak kabul eder

    public static void method2(){

    }

    private void method3(){

    }

    // 3- return type method signature ina dahil olmadigindan
    //farkli secilebilir ancak
    //return type void veya primitive ise ayni olmak zorundadir
    //Eger return type lar non-primitive ise
    //child class daki return type, parent class daki return type i
    // ile ayni veya child i olmalıdır

    public void method4(){

    }

    public Integer method5(){
        return 5;

    }
}

