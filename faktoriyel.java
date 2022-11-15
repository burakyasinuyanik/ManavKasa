import java.util.Scanner;
public class faktoriyel {
    public static void main(String[] args) {

        int ki=1,ri=1, ni=1,r,n,atotal,rntotal=1,totaln=1,totalr=1;
        Scanner input= new Scanner(System.in);



            System.out.print("Faktöriyel r sayısını giriniz:");
            n=input.nextInt();

            System.out.print("Faktöriyel n sayısını giriniz:");
            r=input.nextInt();

        while (ni<=r){

            totalr*=ni;
            ni++;
        }
        while (ri<=n){

            totaln*=ri;
            ri++;
        }
        while (ki<=(n-r)){

            rntotal*=ki;
            ki++;
        }
        atotal=totaln/(totalr*rntotal);
        System.out.println("C(n,r) açılımı:"+atotal);
    }}


