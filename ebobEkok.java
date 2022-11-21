import java.util.Scanner;
public class ebobEkok {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int n1,n2,i=1,ebob=1;

        System.out.print("Lütfen n1 sayısını giriniz:");
        n1=input.nextInt();

        System.out.print("Lütfen n2 sayısını giriniz:");
        n2=input.nextInt();

        if (n1<n2) {
            while (i < n1) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
            System.out.println("Ebob :" + ebob);

        }else if (n2<n1) {
            while (i<n2){
                if (n1 % i == 0 && n2 % i == 0){
                    ebob=i;
                }
                i++;
            }
            System.out.println("Ebob :" + ebob);
        }else {
            System.out.println("Ebob :"+n1);
        }
        System.out.println("Ekok :"+n1*n2/ebob);

    }
}
