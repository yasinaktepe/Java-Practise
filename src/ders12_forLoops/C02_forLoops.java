package ders12_forLoops;

public class C02_forLoops {
    public static void main(String[] args) {

        for (int i = 0; i <=10 ; i++) {

            System.out.print(i + " ");
        }

        System.out.println("");
        //2 basamakli sayilardan 7 ile bolunrbilenleri yhanyana yazdirin

        for (int i = 10; i <100 ; i++ ) {



         if(i%7==0)   System.out.print(i +" ");

        }


        System.out.println("");

        //13 dn basliyarak 7 ser 7ser artıtıp yazdırşaım

        for (int i = 13; i <=100 ; i+=7) {

            System.out.print(i + " ");

        }

        System.out.println("");

        //1 den 10 kadar sinirlar dahil sayilarin karelerinin yazdirin

        for (int i = 1; i <=10 ; i++) {

            System.out.print(i*i + " ");

        }






    }
}
