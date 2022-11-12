import java.util.Scanner;
public class kosulluSınıfGecme {
    public static void main(String[] args) {

        int matematik,fizik,turkce,kimya,muzik;
        double notToplami,ortalama;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        matematik = input.nextInt();

        System.out.print("Fizik notunuzu giriniz:");
        fizik = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz:");
        turkce = input.nextInt();

        System.out.print("Kimya notunuzu giriniz:");
        kimya= input.nextInt();

        System.out.print("Müzik notunuzu giriniz:");
        muzik = input.nextInt();

        notToplami = (matematik+fizik+turkce+kimya+muzik);



        if (matematik>=0 && matematik<=100 && fizik>=0 && fizik<=100 && turkce>=0 && turkce<=100 &&
                kimya>=0 && kimya<=100 && muzik>=0 && muzik<=100) {

            ortalama = notToplami/5;
            System.out.println("Ortalamanız :" + ortalama);

            if (ortalama >=55) {
                System.out.println("Tebrikler sınıfı geçtiniz.");
            }else {
                System.out.println("Sınıfı geçemediniz!");

            }
        }else {
            System.out.print("Yanlış not girdiniz tekrar deneyiniz.");
        }




    }

        }