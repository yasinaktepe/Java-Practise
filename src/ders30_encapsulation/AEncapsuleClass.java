package ders30_encapsulation;

public class AEncapsuleClass {
    private String hastaneIsmi="Yildiz Hastanesi";
    //hastane ismi gorulebilsin ama degistirilemesin

    public String getHastaneIsmi() {
        return hastaneIsmi;
    }

    public void setHastaUcreti(int hastaUcreti) {
        this.hastaUcreti = hastaUcreti;
    }

    private int hastaUcreti;
    //hasta ucretleride giris yapılabilsin ama
    //ucreti sigortadan alinacagi icin personel hasta ucretlerini goremesin


    private String hemsireIsmi;
    private String hemsireAdresi;
    //bu instance variable lara da herkes ulasabilsin
    //bu durumda public yapmak akla gelen ilk cozum olacaktır
    // bu variable lari public yapmak yerine
    //private yapip, getter ve setter olusturmak da
    //ayni islevi gorur


    public String getHemsireIsmi() {
        return hemsireIsmi;
    }

    public void setHemsireIsmi(String hemsireIsmi) {
        this.hemsireIsmi = hemsireIsmi;
    }

    public String getHemsireAdresi() {
        return hemsireAdresi;
    }

    public void setHemsireAdresi(String hemsireAdresi) {
        this.hemsireAdresi = hemsireAdresi;
    }
}
