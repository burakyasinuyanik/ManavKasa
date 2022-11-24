
public class palindromSayi {
    static boolean isPalindrom(int number){
        int tempNumber,reverseNumber,lastNumber=0;
        tempNumber=number;
        while (tempNumber!=0){
           reverseNumber= tempNumber%10;
           tempNumber/=10;
           lastNumber=(lastNumber*10)+reverseNumber;

        }
        if (lastNumber==number)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {

        System.out.println(isPalindrom(5));

    }
}
