import java.util.Scanner;
public class ucakBileti {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mesafe,yas,yolculukTipi;
        double tutar,yasIndirimi,gidisDonus,indirimsizGd;

        System.out.print("Yolculuk mesafenizi km türünden giriniz:");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz:");
        yas = input.nextInt();
        System.out.print("yolculuk tipinizi seçiniz\n1-Tek Yön\n2-Gidiş dönüş\nSeçiminiz:");
        yolculukTipi =input.nextInt();

        tutar =mesafe*0.10;
        if (tutar > 0 && mesafe>0) {



        switch (yolculukTipi){

            case 1:
                if (yas<12) {

                    yasIndirimi = tutar / 2;
                    System.out.println("Normal Tutar :" + tutar + " Tl");
                    System.out.println("Yaş indirimi :  "+yasIndirimi+" TL");
                    System.out.println("İndirimli Tutar :" + yasIndirimi + " Tl");
                    System.out.println("Ödenecek Toplam Tutar :" + yasIndirimi + " Tl");
                } else if (yas<25 && yas >=12) {

                    yasIndirimi =tutar*0.10;
                    System.out.println("Normal Tutar :" + tutar + " Tl");
                    System.out.println("Yaş indirimi :  "+yasIndirimi+" TL");
                    System.out.println("İndirimli Tutar :" + (tutar-yasIndirimi) + " Tl");
                    System.out.println("Ödenecek Toplam Tutar :" + (tutar-yasIndirimi) + " Tl");
                } else if (yas<=65 && yas>25) {

                    System.out.println("Ödenecek Toplam Tutar :" + (tutar) + " Tl");
                    
                }else {
                    yasIndirimi =tutar*0.30;
                    System.out.println("Normal Tutar :" + tutar + " Tl");
                    System.out.println("Yaş indirimi :  "+yasIndirimi+" TL");
                    System.out.println("İndirimli Tutar :" + (tutar-yasIndirimi) + " Tl");
                    System.out.println("Ödenecek Toplam Tutar :" + (tutar-yasIndirimi) + " Tl");

                }break;
            case 2 :
                if (yas<12) {

                    indirimsizGd =2*tutar;
                    yasIndirimi =2*tutar*0.50;
                    gidisDonus =(indirimsizGd-yasIndirimi)*0.20;

                    System.out.println("Normal Tutar :"+indirimsizGd+" Tl");
                    System.out.println("Yaş indirimi :"+yasIndirimi+" Tl");
                    System.out.println("Yaş indirimli Tutar :"+(indirimsizGd-yasIndirimi)+" Tl");
                    System.out.println("Gidiş Dönüş Bilet İndirimi :"+gidisDonus+" Tl");
                    System.out.println("Ödenecek Toplam Tutar :"+(indirimsizGd-yasIndirimi-gidisDonus)+"Tl");


                } else if (yas<25 && yas >=12) {

                    indirimsizGd =2*tutar;
                    yasIndirimi =2*tutar*0.10;
                    gidisDonus =(indirimsizGd-yasIndirimi)*0.20;

                    System.out.println("Normal Tutar :"+indirimsizGd+" Tl");
                    System.out.println("Yaş indirimi :"+yasIndirimi+" Tl");
                    System.out.println("Yaş indirimli Tutar :"+(indirimsizGd-yasIndirimi)+" Tl");
                    System.out.println("Gidiş Dönüş Bilet İndirimi :"+gidisDonus+" Tl");
                    System.out.println("Ödenecek Toplam Tutar :"+(indirimsizGd-yasIndirimi-gidisDonus)+"Tl");

                } else if (yas>25 &&yas<=65) {

                    indirimsizGd =2*tutar;
                    gidisDonus =indirimsizGd*0.20;

                    System.out.println("Normal Tutar :"+indirimsizGd+" Tl");
                    System.out.println("Gidiş Dönüş Bilet İndirimi :"+gidisDonus+" Tl");
                    System.out.println("Ödenecek Toplam Tutar :"+(indirimsizGd-gidisDonus)+"Tl");


                }else {
                    indirimsizGd =2*tutar;
                    yasIndirimi =2*tutar*0.30;
                    gidisDonus =(indirimsizGd-yasIndirimi)*0.20;

                    System.out.println("Normal Tutar :"+indirimsizGd+" Tl");
                    System.out.println("Yaş indirimi :"+yasIndirimi+" Tl");
                    System.out.println("Yaş indirimli Tutar :"+(indirimsizGd-yasIndirimi)+" Tl");
                    System.out.println("Gidiş Dönüş Bilet İndirimi :"+gidisDonus+" Tl");
                    System.out.println("Ödenecek Toplam Tutar :"+(indirimsizGd-yasIndirimi-gidisDonus)+"Tl");

                } break;

                default:
                System.out.println("Hatalı giriş yaptınız.");
        }
    }else {
            System.out.println("Hatalı giriş yaptınız.");
        }
    }
}