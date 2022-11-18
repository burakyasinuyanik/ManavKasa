import java.util.Scanner;
public class yildizElmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i=1,n,j=1,k=1;
        System.out.print("n sayısını giriniz:");
        n=input.nextInt();

       while (i<=n){
           while (k<=n-i){
               System.out.print(" ");
               k++;
           }while (j<=(2*i)-1){
               System.out.print("*");

               j++;
           }
           System.out.println();
           k=1;
           j=1;
           i++;

       }
       i=2;
       j = (2 * n) - 2;
        while (i<=n){
            while (k<=i-1){
                System.out.print(" ");
                k++;
            }
            while (j >= (2*i) - 2 ){
                System.out.print("*");

                j--;
            }
            System.out.println();
            k=1;
            j = (2 * n) - 2;
            i++;

        }

        }
    }

