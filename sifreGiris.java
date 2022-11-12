import java.util.Scanner;
public class sifreGiris {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String username, newPassword, password,cevap;
        System.out.print("Lütfen kullanıcı adınızı giriniz:" );
        username = input.nextLine();
        System.out.print("Lütfen kullanıcı şifrenizi giriniz:");
        password = input.nextLine();



        if (username.equals("patika") && password.equals("java123")){
            System.out.println("Başarılı giriş yaptınız.");
        }
        else {
            System.out.println("Giriş Başarısız");
            System.out.println("Şifre sıfırlamak ister misiniz?\n1-Evet\n2-Hayır");
            System.out.print("Seçiminiz :");
            cevap=input.nextLine();

            switch (cevap){

                case "Evet":

                    System.out.println("Lütfen yeni şifrenizi giriniz.Şifreniz bir önceki şifreniz ile aynı olmaması gerekmektedir.");
                    System.out.print("Yeni şifreniz :");
                    newPassword = input.nextLine();


                    if (newPassword.equals("java123")) {
                        System.out.println("Şifre oluşturulamadı,lütfen başka şifre giriniz.");
                        System.out.print("Yeni şifrenizi tekrar giriniz :");
                        newPassword = input.nextLine();
                        System.out.println("Şifre oluşturuldu");


                    }else {
                    System.out.println("Şifre oluşturuldu");
                    }
                    break;

                case "Hayır":
                    System.out.println("Giriş yapmayı tekrar deneyiniz.");
                    break;

            }


            }

        }



    }

