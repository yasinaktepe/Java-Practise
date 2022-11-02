package ders10_stringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {

        String str= "Ahmet hoca ile hersey clear";

        System.out.println(str.indexOf("a")); //9 ilk a nın index inin dondürüyor

        System.out.println(str.indexOf('c')); //8

        System.out.println(str.indexOf("hersey"));//15

        System.out.println(str.indexOf("e",9));//13

        System.out.println(str.indexOf("e",14)); //16

        //cumledeki 2. c nin indexini yazdirin

        int ilkcindex= str.indexOf("c");//8

        System.out.println(str.indexOf("c",ilkcindex+1));

        //olmayan herşey için -1 döner

        System.out.println(str.indexOf("ali"));//-1


    }
}
