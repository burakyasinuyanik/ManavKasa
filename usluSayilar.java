import java.util.Scanner;
public class usluSayilar {
    public static void main(String[] args) {

        int total=1,i=1,a,us;

        Scanner input=new Scanner(System.in);

        System.out.print("üssü alınacak sayıyi giriniz:");
        a=input.nextInt();
        System.out.print("üs olacak sayıyı giriniz:");
        us=input.nextInt();

        for ( i=1 ; i<=us ; i++){
            total*=a;
        }
        System.out.println("Cevap:"+total);


    }
}
