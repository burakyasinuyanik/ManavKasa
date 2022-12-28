import java.util.Arrays;
import java.util.Scanner;
public class sayiTahmin {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int random,number,right=0;
        boolean isWrong=false;

        random= (int) (Math.random() * 100);
        System.out.println(random);
        int[] liste=new int[5];

        while (right<5){
            System.out.print("Lütfen sayı tahmininizi giriniz:");
            number=input.nextInt();
            liste[right]=number;
            if (number<0 || number>99){
                if (!isWrong){
                    System.out.println("Girdiğiniz sayı 0-99 arası olması gerekmektedir.");
                    System.out.println("Bir dahaki hatalı girişinizde sayı hakkınız düşücektir");
                    isWrong=true;
                }else {
                    right++;
                    System.out.println("Çok fazla hatalı girişi yaptınız. Kalan hakkınız:"+(5-right));
                }
                continue;
            }
            if (number==random){
                System.out.println("Tebrikler oyunu kazandınız.Tahmininiz doğru");
                System.out.println("Tahminleriniz:"+Arrays.toString(liste));
                break;
            } else {
                System.out.println("Tahminini doğru değil");
                right++;
                System.out.println("Kalan hakkınız:"+(5-right));
                if (number>random){
                    System.out.println("Girmiş olduğunuz sayı gizli sayıdan büyüktür");
                }else {
                    System.out.println("Girmiş olduğunuz sayı gizli sayıdan küçüktür");
                }

            }

        }
        System.out.println("Tahminleriniz:"+Arrays.toString(liste));
        System.out.println("Gizli sayı:"+random);



    }
}
