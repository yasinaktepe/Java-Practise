package ders40_Interfaces;

public interface I08_InterfaceStaticVeDefaultMethods {

    /*
    Java 8 ile developer larin talebi uzerine yeni bir istisnai durum java ya eklenmistir

    vir interface i yillar icerisinde yuzlerce class inherit etmis olabilir
    sonradan interface e eklenen bir abstract method tum eski childlar tarafindan inherit
    edilmedilir. Aksi halde tum eski child class lar CTE verecektir.

    Java 8 ile birlikte java, interface lere default ve static ile isaretlenmek
    sarti ile body si olan method eklenmesine izin vermistir
    Bu sayede interface e sonradan eklenen method body si oldugu icin
    override edilmek zorunda DEGILDIR

    Interface icerisinde body si olan method olusturmak icin kullanilan defult
    ve static keyword leri arasinda tek bir fark vardir

    default kullanilan methodlar obje olusturularak cagrilabilirken
    static olarak isaretlenen methodlar direkt kullanilabilirler

     */

    void method1();
    void method2();

    //interface deki tum methodlar public ve abstractir
    //biz interface deki bir method deklarasyonuna default yazarsak
    //bu access nodifier degildir

    //
    public default void method3(){
        System.out.println("interface icindeki body li defult method");
    }

    public static void method4(){
        System.out.println("interface icindeki bodyli static method");

    }
}
