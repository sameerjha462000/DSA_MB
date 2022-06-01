import java.util.*;
import java.lang.*;
class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printChess(n);
    }
    public static void printChess(int n){
        char[][] chess = new char[n][n];
        for(int i= 0 ;i<n;i++){
            for(int j= 0 ;j<n;j++){
                chess[i][j]='.';
            }
        }
        printChess(chess,0);
    }
    public static boolean isSafe(char[][] chess,int row,int col){
        for(int r = row,c = col;r>=0;r--){
            if(chess[r][c]=='Q')
                return false;
        }
        for(int r = row,c = col;r>=0&&c>=0;r--,c--){
            if(chess[r][c]=='Q')
                return false;
        }
        for(int r = row,c = col;r>=0&&c<chess[0].length;r--,c++){
            if(chess[r][c]=='Q')
                return false;
        }
        return true;
    }
    public static void printChess(char[][] chess,int row){
        if(row==chess.length){
            print(chess);
            System.out.println();
            return;
        }
        for(int i= 0 ;i<chess[0].length;i++){
            if(isSafe(chess,row,i)){
                // place the queen here
                chess[row][i]='Q';
                printChess(chess,row+1);
                chess[row][i]='.';
            }
        }
        return;
    }
    public static void print(char[][] chess){
        for(char[] ch:chess){
            System.out.println(Arrays.toString(ch));
        }
    }
    
}
