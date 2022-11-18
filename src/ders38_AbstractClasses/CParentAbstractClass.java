package ders38_AbstractClasses;

public abstract class CParentAbstractClass {

    /*
    Abstract bir class abstract methodlara sahip olabilir
    Bir class i abstract yapmak icin class declaration ina abstract keyword eklenmedilidir.
     */

    public abstract void mecburiMethod1();

    public abstract void mecburiMethod2();
    // Soyut yani abstract methodlarin body si olmaz

    public String concreteMethod(){
        //Bugüne kadar kullandigimiz normal methodlara
        //soyut olmayan method yerine concrete method denir

        return "";
    }




    /*Bir parent class da child class larin mutlaka override edecegi  bir method olusturdugumuzda
    method body si gereksizlesir
    cunku hic calismayacaktır.

    1- Parent class dan obje olusturulamayacagi icin objeler icin bu method kullanilamaz
    2- child class lar da mecburen bu method uoverride edeceklerinden,
       bu method larin body si asla KULLANILMAYACAKTIR.

    Java hic kullanilmaycak bu method body leri yazmamiza imkan tanimistir.

     */


    // Child class larin mutlaka override etmesini istedigimiz methodlari
    //abstract olarak tanimlar ve body siz olarak olustururuz
}
