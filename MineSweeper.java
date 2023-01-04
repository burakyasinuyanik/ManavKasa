import java.util.Scanner;
import java.util.Random;

public class MineSweeper {

    int [][] map;
    int [][] board;
    int rowNumber;
    int colNumber;
    int size;
    boolean game=true;
    Scanner input = new Scanner(System.in);
    Random rand= new Random();


    MineSweeper (int rowNumber, int colnumber){
        this.rowNumber=rowNumber;
        this.colNumber=colnumber;
        this.map=new int[rowNumber][colnumber];
        this.board=new int[rowNumber][colnumber];
        this.size=rowNumber*colnumber;

    }
    void run(){
        int row,col,succes=0;
        prepareGame();

        System.out.println("Oyun başladı.");
        System.out.println("========");
        print(map);
        System.out.println("**************");
        while (game){
            print(board);
            System.out.print("Lütfen satırı giriniz:");
            row=input.nextInt();
            System.out.print("Lütfen sütunu giriniz:");
            col=input.nextInt();
            if (row<0 || row>=rowNumber){ System.out.println("Geçersiz Koordinat!"); continue;}
            if (col<0 || col>=colNumber) { System.out.println("Geçersiz Koordinat!"); continue;}
            if (map[row][col]!=-1){
                checkMine(row,col);
                succes++;
                if (succes==((size)-(size/4))){
                    System.out.println("Başardınız");
                    break;
                }

            }else {
                System.out.println("Game over");
                game=false;
            }

        }

    }
   public void prepareGame(){

        int randRow,randCol, count=0;

        while (count!=(size/4)){
            randRow=rand.nextInt(rowNumber);
            randCol=rand.nextInt(colNumber);

            if (map[randRow][randCol]!=-1) {
                map[randRow][randCol]=-1;
            }
            count++;
        }

    }
   public void print(int[][] arr){
       for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr[0].length; j++) {
               System.out.print(" "+arr[i][j]);
               if (arr[i][j]>=0){
                   System.out.print(" ");
               }
           }
           System.out.println();
       }

   }
   public void checkMine(int r,int c){
        if(map[r][c]==0) {
            if (c<colNumber-1 && map[r][c + 1] == -1) {
                board[r][c]++;
            }
            if (r<rowNumber-1 && map[r + 1][c] == -1) {
                board[r][c]++;
            }
            if (c>0 && map[r][c - 1] == -1) {
                board[r][c]++;
            }
            if (r>0 && map[r - 1][c] == -1) {
                board[r][c]++;
            }
        }if (board[r][c]==0){
            board[r][c]=-2;
       }

   }
}

