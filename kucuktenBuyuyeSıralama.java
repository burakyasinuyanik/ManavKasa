import java.util.Scanner;
public class kucuktenBuyuyeSıralama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a,b,c;
        System.out.print("Lütfen a sayısını giriniz:");
        a =input.nextInt();
        System.out.print("Lütfen b sayısını giriniz:");
        b =input.nextInt();
        System.out.print("Lütfen c sayısını giriniz:");
        c =input.nextInt();

        if (a<b && a<c){
                if(a<b && b<c){
                    System.out.println(a+"<"+b+"<"+c);
                    System.out.println("a<b<c");
                } else if ( c<b) {
                    System.out.print(a+"<"+c+"<"+b);
                    System.out.println("a<c<b");
                }

        } else if (b<a && b<c) {
                if(a<c){
                System.out.println(b+"<"+a+"<"+c);
                System.out.println("b<a<c");
            }   else if (c<a) {
                System.out.println(b+"<"+c+"<"+a);
                System.out.println("b<c<a");
            }

        } else if (c<a && c<b) {
                if (a<b){
                 System.out.println(c+"<"+a+"<"+b);
                 System.out.println("c<a<b");
        }       else if (b<a) {
                System.out.println(c + "<" + b + "<" + a);
                System.out.println("c<b<a");
            }
        }else {
            System.out.println("Girdiğiniz sayıyı kontrol ediniz.(eşit sayı olabilir)");
        }
    }
}
