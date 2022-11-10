import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
       int a ,b,select;

        System.out.print("a sayısını giriniz : ");
        a=input.nextInt();

        System.out.print("b sayısını giriniz : ");
        b=input.nextInt();

        System.out.println("Yapmak istediğiniz işlem numarasını giriniz?\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme  ");
        System.out.print("seçiminiz :");
        select=input.nextInt();
        switch (select) {
            case 1:
                System.out.println("İşlem sonucunuz :" + (a+b));
                break;
            case 2:
                System.out.println("Çıkarma işlemi sonucunuz :"+(a-b));
                break;
            case 3:
                System.out.println("Çarpma işlemi sonucunuz :" + (a*b));
                break;
            case 4:
                switch (b){
                    case 0:
                        System.out.println("0 ile bölme yapamazsınız");
                        break;
                    default:
                        System.out.println("Bölme işlemi sonucunuz :" + (a/b));
                        break;
                }





        }




    }


    }

