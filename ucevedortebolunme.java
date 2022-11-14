import java.util.Scanner;
public class ucevedortebolunme {
    public static void main(String[] args) {

        int o=0, bolen=0, k,i=1;

        Scanner input = new Scanner(System.in);

         System.out.print("Lütfen bir sayı giriniz:");
         k =input.nextInt();

        while (i<=k) {
            if (i % 3 == 0 && i % 4 == 0 ) {
                System.out.println("3'e ve 4'e bölünen sayılar:" + i);
                o += i;
                bolen++;
            }
            i++;
        }
        System.out.println("Toplam sayı adeti:"+bolen);
        System.out.println("Sayıların toplamı:"+o);
        System.out.println("Sayıların ortalamsı:"+o/bolen);
    }
    }



