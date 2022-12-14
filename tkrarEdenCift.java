import java.util.Arrays;
public class tkrarEdenCift {
    static boolean isFind(int[]arr,int value){
        for (int i:arr){
            if (i==value)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {

        int[] list={1,8,6,74,32,64,32,33,11,4,6,1,7,4,8,21,7};
        int[] dublicate=new int[list.length];
        int startIndex=0;
        for (int i=0;i<list.length;i++){
            for (int j=0;j<list.length;j++){
                if (list[j]%2==0 && i!=j && list[j]==list[i]){
                    if (!isFind(dublicate,list[j])){

                        dublicate[startIndex++]=list[j];
                    }
                    break;


                }

            }

        }
        for (int k:dublicate){
            if (k!=0){
                System.out.print(k+",");
            }
        }
    }
}
