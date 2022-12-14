import java.util.Scanner;
import java.util.Arrays;
public class elemanSiralama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz:");
        int[] list=new int[input.nextInt()];

        for (int i=0;i< list.length;i++){
            System.out.print((i+1) +". elemanı giriniz:");
            list[i]=input.nextInt();
        }
        Arrays.sort(list);
        System.out.println("Sıralama:"+Arrays.toString(list));
    }
}
