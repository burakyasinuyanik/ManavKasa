import java.util.Scanner;
public class basamakToplami {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int sayi,toplam=0,basamakToplam=0;
        do{
        System.out.print("Basamaklarını toplayacağınız sayıyı giriniz:");
        sayi=input.nextInt();

        while (sayi!=0){
            toplam=sayi%10;
            basamakToplam+=toplam;
            sayi/=10;
        }
        System.out.println("Basamak toplamı :"+basamakToplam);
        basamakToplam=0;

    }while (basamakToplam==0);
}}
