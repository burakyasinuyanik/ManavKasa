import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class diziBykKck {
    public static void main(String[] args) {
        int a,small = 0,big=0;
        int[] list={15,12,788,1,-1,-778,2,0};
        Scanner input=new Scanner(System.in);
        System.out.println(Arrays.toString(list));
        System.out.print("Lütfen bir sayı giriniz:");
        a=input.nextInt();
        Arrays.sort(list);

        for (int i:list){
            if (i<a){
                small=i;

            }if (i>a){
                 big=i;
                break;
            }

        }
        System.out.println("Girilen sayıdan küçük en yakın sayı:"+small);
        System.out.println("Girilen sayıdan büyük en yakın sayı:"+big);


    }
}
