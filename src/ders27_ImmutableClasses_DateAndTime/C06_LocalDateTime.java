package ders27_ImmutableClasses_DateAndTime;

import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime zaman=LocalDateTime.now();
        System.out.println(zaman);  //2022-10-29T19:30:11.399086800

        System.out.println(zaman.getDayOfYear());  //302



    }
}
