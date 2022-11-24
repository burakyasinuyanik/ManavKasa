import java.util.Scanner;
public class gelismisHesapMakinesi {

    static void toplam(){
        int a,b;
        Scanner input =new Scanner(System.in);
        System.out.print("Lütfen ilk sayıyı giriniz:");
        a=input.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz:");
        b=input.nextInt();
        System.out.println("işlem sonucunuz:"+a+b);
    }
    static void cikarma(){
        int a,b;
        Scanner input =new Scanner(System.in);
        System.out.print("Lütfen ilk sayıyı giriniz:");
        a=input.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz:");
        b=input.nextInt();
        System.out.println("işlem sonucunuz:" + (a-b));

    }
    static void carpma(){
        int a,b;
        Scanner input =new Scanner(System.in);
        System.out.print("Lütfen ilk sayıyı giriniz:");
        a=input.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz:");
        b=input.nextInt();
        System.out.println("işlem sonucunuz:" + (a*b));
    }
    static void bolme(){
        int a,b;
        Scanner input =new Scanner(System.in);
        System.out.print("Lütfen ilk sayıyı giriniz:");
        a=input.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz:");
        b=input.nextInt();
        if (b==0)
            System.out.println("Sıfır ile bölme yapamazsınız.");
        else
        System.out.println("işlem sonucunuz:" + (a/b));
    }
    static void usAlma(){
        int result=1,a,b;
        Scanner input =new Scanner(System.in);
        System.out.print("Lütfen üs alacağınız sayıyı giriniz:");
        a=input.nextInt();
        System.out.print("Lütfen üs sayısını giriniz:");
        b=input.nextInt();
        for (int i=1;i<=b;i++){
            result*=a;
        }
        System.out.println("işlem sonucunuz:"+result);
    }
    static void faktoriyel(){
        int a;
        Scanner input =new Scanner(System.in);
        System.out.print("Lütfen faktöriyel sayısını giriniz:");
        a=input.nextInt();

        int result=1;
        for (int i=1;i<=a;i++){
            result *=i;
        }
        System.out.println("İşlem sonucunuz:"+result);
    }
    static void mod(){
        int a,b;
        Scanner input =new Scanner(System.in);
        System.out.print("Lütfen ilk sayıyı giriniz:");
        a=input.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz:");
        b=input.nextInt();
        System.out.println("işlem sonucunuz:"+a%b);
    }
    static void dikdortgen(){
        int cevre,alan,a,b;
        Scanner input =new Scanner(System.in);
        System.out.print("Lütfen ilk sayıyı giriniz:");
        a=input.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz:");
        b=input.nextInt();

        cevre=2*(a+b);
        alan=a*b;
        System.out.println("çevre:"+cevre+"\nAlan:"+alan);
    }

    public static void main(String[] args) {

            Scanner input =new Scanner(System.in);
            int select;

        String menu="1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "9- Menüyü tekrardan yazma\n"
                + "0- Çıkış Yap";

        System.out.println(menu);
        do {


            System.out.print("Lütfen yapacağınız işlemi seçiniz :");
            select = input.nextInt();


            switch (select) {
                case 1:
                    toplam();
                    break;
                case 2:
                    cikarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    usAlma();
                    break;
                case 6:
                    faktoriyel();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    dikdortgen();
                    break;
                case 9:
                    System.out.println(menu);
                    break;
                case 0:

                    break;

                default:
                    System.out.println("Hatalı bir işlem seçtiniz");


            }
        }while (select!=0);
        System.out.println("güle güle");
        }
    }



