import java.util.Scanner;
public class burcBulanProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Burç bulma programına hoşgeldiniz.");
        String ay;
        int gun;

        System.out.print("Lütfen doğduğunuz ayı giriniz:");
        ay = input.nextLine();
        System.out.print("Lütfen doğduğunuz günü giriniz:");
        gun = input.nextInt();

        if(ay.equals("ocak")){
            if(1<=gun && gun<22){
                System.out.println("Burcunuz oğlak burcudur");
            }else if (gun <=31){
                System.out.println("Burcunuz kova burcudur");
            }
        }
        else if(ay.equals("şubat")){
            if(1<=gun && gun<20){
                System.out.println("Burcunuz kova burcudur");
            }else if (gun <=30){
                System.out.println("Burcunuz balık burcudur");
            }
        }else if(ay.equals("mart")){
            if(1<=gun && gun<21){
                System.out.println("Burcunuz balık burcudur");
            }else if (gun <=31){
                System.out.println("Burcunuz koç burcudur");
            }}
        else if(ay.equals("nisan")){
            if(1<=gun && gun<21){
                System.out.println("Burcunuz koç burcudur");
            }else if (gun <=30){
                System.out.println("Burcunuz boğa burcudur");
            }}
        else if(ay.equals("mayıs")){
            if(1<=gun && gun<22){
                System.out.println("Burcunuz boğa burcudur");
            }else if (gun <=31){
                System.out.println("Burcunuz ikizler burcudur");
            }}
        else if(ay.equals("haziran")){
            if(1<=gun && gun<23){
                System.out.println("Burcunuz ikizler burcudur");
            }else if (gun <=30){
                System.out.println("Burcunuz yengeç burcudur");
            }}
        else if(ay.equals("temmuz")){
            if(1<=gun && gun<23){
                System.out.println("Burcunuz yengeç burcudur");
            }else if (gun <=31){
                System.out.println("Burcunuz aslan burcudur");
            }}
        else if(ay.equals("ağustos")){
            if(1<=gun && gun<23){
                System.out.println("Burcunuz aslan burcudur");
            }else if (gun <=31){
                System.out.println("Burcunuz başak burcudur");
            }}
        else if(ay.equals("eylül")){
            if(1<=gun && gun<23){
                System.out.println("Burcunuz başak burcudur");
            }else if (gun <=30){
                System.out.println("Burcunuz terazi burcudur");
            }}
        else if(ay.equals("ekim")){
            if(1<=gun && gun<23){
                System.out.println("Burcunuz terazi burcudur");
            }else if (gun <=31){
                System.out.println("Burcunuz akrep burcudur");
            }}
        else if(ay.equals("kasım")){
            if(1<=gun && gun<30){
                System.out.println("Burcunuz akrep burcudur");
            }else if (gun <=31){
                System.out.println("Burcunuz yay burcudur");
            }}
        else if(ay.equals("aralık")){
            if(1<=gun && gun<31){
                System.out.println("Burcunuz yay burcudur");
            }else if (gun <=31){
                System.out.println("Burcunuz oğlak burcudur");
            }}

        else {
            System.out.println("Lütfen tekrar deneyiniz");
        }
    }



}
