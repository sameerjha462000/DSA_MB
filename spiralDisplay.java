import java.io.*;
import java.util.*;

public class Main {

    public static void spiralDisplay(int[][] nums){
      int nr = nums.length;
      int nc = nums[0].length;
      int sr = 0 ;
      int er = nr-1;
      int sc = 0;
      int ec = nc-1;
      int tne = nr*nc;
      while(tne!=0){
        for(int r = sr, c =sc;(r<=er && tne>0);r++){
          System.out.println(nums[r][c]);
          --tne;
        }
        for(int r =er,c = sc+1;(c<=ec&& tne >0);c++){
          System.out.println(nums[r][c]);
          --tne;
        }
        for(int r=er-1,c= ec;(r>=sr&&tne>0);r--){
          System.out.println(nums[r][c]);
          --tne;
        }
        for(int r = sr,c = ec-1;(c>=sc+1&& tne>0);--c){
          System.out.println(nums[r][c]);
          --tne;
        }
        sr++;
        er--;
        sc++;
        ec--;
      }
    }
    public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      int nr = scn.nextInt();
      int nc = scn.nextInt();
      int[][] nums = new int[nr][nc];
      for(int i= 0 ;i<nr;i++){
        for(int j=0;j<nc;j++){
          nums[i][j] = scn.nextInt();
        }
      }
      spiralDisplay(nums);
    }

}
