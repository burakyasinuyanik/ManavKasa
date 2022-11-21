import java.util.Scanner;
public class minMax {
    public static void main(String[] args) {

        int i=1,n,small=1,big=1,number=1;
        Scanner input = new Scanner(System.in);

        System.out.print("kaç adet sayı gireceksiniz?");
        n=input.nextInt();

        while (i<=n){
            System.out.print(i+" . Sayıyı giriniz :");
            number=input.nextInt();
            if (i == 1) {
                small = number;
                big = number;
            }
            if (number < small) {
                small = number;

            } else if (number > big) {
                big = number;
            }
            i++;
        }
        System.out.println("En büyük sayı:"+big);
        System.out.println("En küçük sayı:"+small);
    }
}
