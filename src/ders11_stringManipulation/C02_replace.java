package ders11_stringManipulation;

public class C02_replace {
    public static void main(String[] args) {

        String str= "Java candir";

        System.out.println(str.replace('a', 'A')); //   JAvA cAndir

        System.out.println(str.replace(' ','_'));   //Java_candir

        System.out.println(str.replace("candir" , "cok guzeldir"));

        System.out.println(str.replace(" ", ""));//Javacandir

        System.out.println(str.replace("a", "")); //Jv cndir

        System.out.println(str.replace("Java","hava").replace("candir","cok guzel"));
        //hava cok guzel


        System.out.println(str.replace("","_"));  //_J_a_v_a_ _c_a_n_d_i_r_


        System.out.println(str.replaceFirst("a", "A"));        //JAva candir


    }
}
