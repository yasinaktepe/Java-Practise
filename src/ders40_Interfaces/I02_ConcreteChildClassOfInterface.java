package ders40_Interfaces;

public class I02_ConcreteChildClassOfInterface implements I01_Interface {
    //Bir class i bir interface sin childi yapmak icin implements key word kullanilir

    public static void main(String[] args) {

        System.out.println(MESAJ); //Hello Interface
        //sayi=40; yazili olmasada interface icerisinde oldugundan
        //final dir ve atama yapilamaz

        System.out.println(Integer.MAX_VALUE);
        //normalde variable isimleri, kucuk harfle baslar ve camelCase kullanilir
        //ancak java da ortak kabul olarak
        //static ve final olarak isaretlenen variable isimleri tamamen buyuk harf ile yazilir

        System.out.println(Math.PI);
    }

    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }
}
