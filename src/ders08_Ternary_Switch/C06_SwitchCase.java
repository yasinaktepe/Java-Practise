package ders08_Ternary_Switch;

public class C06_SwitchCase {
    public static void main(String[] args) {
        //Kullanıcıcıın girdigi gun numarasinin ismini yazdirin

        int gunNo=9;

     /*   if(gunNo==1);{
            System.out.println("Pazartesi");
        } else if (gunNo==2){
            System.out.println("Sali");
        } else if (gunNo==3) {
            System.out.println("Carsamba");
        } else if (gunNo==4) {
            System.out.println("Persembe");
        } else if (gunNo==5) {
            System.out.println("Cuma");
        } else if (gunNo==6) {
            System.out.println("Cumartesi");
        } else if (gunNo==7) {
            System.out.println("Pazar");

        }else{
            System.out.println("Gecersiz gun");
        }
        */

        switch (gunNo){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4 :
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Gecersiz Gun");
        }
    }






}