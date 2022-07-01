import java.io.*;
import java.util.*;
 
public class Main {

    class pair{
      int first;
      int second;

      pair(){

      }
      @Override 
      public String toString(){
        return first+"\n"+second;
      }
    }
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int nc = scn.nextInt();
        int[][] nums = new int[nr][nc];
        for(int i=0;i<nr;i++){
          for(int j=0;j<nc;j++){
            nums[i][j] = scn.nextInt();
          }
        }
        Main a = new Main();
        Main.pair p = a.new pair();
        p = ExitPoint(nums);
        System.out.println(p);
    }
    public static pair ExitPoint(int[][] nums){
      Main a= new Main();
      Main.pair p = a.new pair();
      int direction  = 0;
      int r = 0 ;
      int c = 0 ;
      int nr = nums.length;
      int nc = nums[0].length;

      while(r>=0 && r<nr && c>=0 && c<nc){
          if(direction == 0)
          c++;
          if(direction == 1)
          r++;
          if(direction == 2)
          c--;
          if(direction == 3)
          r--;
          if(r>=0 && r<nr && c>=0 && c<nc && nums[r][c]==1)
          {
            direction = (direction+1) % 4; 
          }
      }
      if( r < 0)
      r++;
      if(r >=nr)
      r--;
      if(c < 0)
      c++;
      if(c >= nc)
      c--;
      p.first = r;
      p.second = c;
      return p;

    }
    
}
