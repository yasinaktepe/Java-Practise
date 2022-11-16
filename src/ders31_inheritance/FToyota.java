package ders31_inheritance;

public class FToyota extends EAraba {

    FToyota(){
        super();
        System.out.println("Toyota const. calisti");
    }

    protected String marka="Toyota";
    protected String motor="Toyota araclar cevreci motor kullanir";
    protected String uretimyeri= "Uretim yeri belirtilmemis";
    protected int hiz=140;

}
