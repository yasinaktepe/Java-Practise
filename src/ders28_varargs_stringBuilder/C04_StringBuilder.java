package ders28_varargs_stringBuilder;

public class C04_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder(7);

        //Bu kod yazildiginda java 7 karakter alabilecek bir SB olusturur

        System.out.println(sb.capacity()); //7
        System.out.println(sb.length()); //0

        sb.append("Java");

        System.out.println(sb);
        System.out.println(sb.capacity()); //7
        System.out.println(sb.length());  //4

        sb.append(" guzeldir.");

        System.out.println(sb); // java guzeldir.
        System.out.println(sb.capacity()); //7*2+2=16
        System.out.println(sb.length()); //14
    }
}
