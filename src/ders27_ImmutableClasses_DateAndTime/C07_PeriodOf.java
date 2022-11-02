package ders27_ImmutableClasses_DateAndTime;

import java.time.LocalDate;
import java.time.Period;

public class C07_PeriodOf {
    public static void main(String[] args) {

        //dogumunuzdan bugune ne kadar zaman gecti?

        LocalDate bugun=LocalDate.now();
        LocalDate dogumgünü=LocalDate.of(1992,01,03);

        Period gecensüre=Period.between(dogumgünü,bugun);
        System.out.println(gecensüre);  //P30Y9M26D

        System.out.println(gecensüre.getYears());  //30

    }
}
