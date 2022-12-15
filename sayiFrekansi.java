import java.util.Arrays;
public class sayiFrekansi {
    public static void main(String[] args) {

        int[] list={10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(list);
        int tempnumber=list[0];

        for (int i=0;i<list.length;i++){
            int counter=0;
            if (i==0 || tempnumber!=list[i]) {
                for (int j = 0; j < list.length; j++) {
                    if (list[i] == list[j]) {
                        counter++;
                        tempnumber=list[i];
                    }
                }
                System.out.println(list[i] + " sayısı " + counter + " tekrar etti");
            }
        }
    }
}
