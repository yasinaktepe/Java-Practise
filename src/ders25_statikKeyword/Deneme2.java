package ders25_statikKeyword;

public class Deneme2 {
    int a=10;
    static int b=20;
    String str1="Ali";
    static String str2="Ayse";
    Deneme2(){
        str1="Hasan";
        str2 += "++";
    }
    Deneme2(int x, int y){
        a=x;
        b=y;
    }
    public static void main(String[] args) {
        Deneme2 dnm1= new Deneme2(6,8);
        System.out.println(dnm1.b);
        Deneme2 dnm2=new Deneme2(10,12);
        System.out.println(dnm1.b);
    }
}
