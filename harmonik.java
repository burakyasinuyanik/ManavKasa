import java.util.Scanner;
public class harmonik {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int n;
        double result=0,i=1;
        System.out.print("N sayısını giriniz :");
        n =input.nextInt();

        while (i<=n){
            result+=1/i;
            i++;
        }
        System.out.println("Harmonik sayı sonucu:"+result);
    }
}
