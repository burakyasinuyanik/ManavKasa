public class matrisTranpoze {
    public static void main(String[] args) {

        int[][] matrix={
                {1,2,3},
                {4,5,6}
        };
        int [][] transpoze=new int[matrix[0].length][matrix.length];

        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
            transpoze[j][i]=matrix[i][j];
            }
        }

        for (int [] k:transpoze){
            for (int l:k){
                System.out.print(l+" ");
            }
            System.out.println();
        }


    }
}
