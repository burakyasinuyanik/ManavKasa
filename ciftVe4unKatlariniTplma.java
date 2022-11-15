import java.util.Scanner;

public class ciftVe4unKatlariniTplma {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int total = 0, k = 0, i;

        do {

            System.out.print("sayı giriniz:");
            i = input.nextInt();
            if(i%2==0||i%4==0){

                total+=i;
            }

        }while (i%2==0);

        System.out.println("Toplam:"+total);

    }
}