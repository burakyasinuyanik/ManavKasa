import java.util.Scanner;
public class dortvebesinkuvvetleri {
    public static void main(String[] args) {

        int n=1,k,i=1;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen sınır sayısı giriniz");
        k=input.nextInt();

        while (i<=k){
            System.out.println("Dördün kuvvetleri:"+i);
            i*=4;
        }
        while (n<=k){

            System.out.println("Beşin kuvvetleri:"+n);
            n*=5;
        }

    }

}
