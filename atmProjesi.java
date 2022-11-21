import java.util.Scanner;
public class atmProjesi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userName, passWord;
        int right = 3, select,balance=1500;

        while (right > 0) {

            System.out.print("Lütfen kullanıcı adınızı giriniz:");
            userName = input.nextLine();
            System.out.print("Lütfen kullanıcı şifrenizi giriniz:");
            passWord = input.nextLine();

        if (userName.equals("patika")&& passWord.equals("dev123")){
            System.out.println("Giriş başarılı");
            System.out.println("Kodluyoruz Bankasına hoşgeldiniz");
            do {

                System.out.println("1-Para yatırma\n" +
                        "2-Para çekme\n" +
                        "3-Bakiye sorgulama\n" +
                        "4-Çıkış yapma");
                System.out.print("Lütfen yapacağınız işlemi seçiniz:");
                select=input.nextInt();
                switch (select){
                    case 1:
                        System.out.print("Para yatırılacak miktarı giriniz:");
                        int inPrice=input.nextInt();
                        if (inPrice<0){
                            System.out.println("Para yatırma başarısız");
                        }else {
                            balance += inPrice;
                            System.out.println("Para yatırma işlemi başarılı\n" +
                                    "Yeni bakiyeniz :" + balance);
                        }
                        break;

                    case 2:
                        System.out.print("Para çekilecek miktarı giriniz:");
                        int outPrice=input.nextInt();
                        if (outPrice<0 || outPrice> balance) {
                            System.out.println("Para çekme işlemi başarısız.\n" +
                                    "Bakiyeniz:"+balance);
                        }else {
                            balance -= outPrice;
                            System.out.println("Para çekme işlemi başarılı\n" +
                                    "Yeni bakiyeniz :" + balance);
                        }break;
                    case 3:
                        System.out.println("------Bakiyeniz-----:"+balance);
                        break;
                }
            }while (select!=4);
            System.out.println("Çıkış Başarılı");
            break;
        }else{
            right--;
            System.out.println("hatalı kullanıcı adı veya şifre  tekrar deneyiniz\n" +
                    "Kalan hakkınız: "+right);
            if(right==0){
                System.out.println("Hesabınız bloke olmuştur. Bankanız ile görüşünüz");
            }

        }}














        }}