import java.util.Scanner;
public class etkinlikOnerme {
    public static void main(String[] args) {

        int sicaklik;

        Scanner input = new Scanner(System.in);

        System.out.print("Etkinlik önermesi için lütfen sıcaklık derecesini giriniz:");
        sicaklik = input.nextInt();

        if (sicaklik<5){
            System.out.println("Kayak yapabilirsiniz.");
        }else if (sicaklik >= 5 && sicaklik <= 25 ){
            if(sicaklik <= 15 && sicaklik >= 10){
                System.out.println("Sinema etkinliği ya da piknik etkinliği yapabilirsiniz.");
            }else if (sicaklik < 10){
                System.out.println("Sinema etkinliği yapabilirsiniz.");
            } else if (sicaklik <= 25 && sicaklik > 15) {
                System.out.println("Piknik etkinliği yapabilirsiniz.");
            }
        }else {
            System.out.println("Yüzme etkinliği yapabilirsiniz.");
        }
    }
}
