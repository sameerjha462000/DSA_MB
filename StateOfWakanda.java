import java.io.*;
import java.util.*;

public class Main{
public static void originalPrint(int[][] nums,int i){
  int nr = nums.length;
  for(int r =0;r<nr;r++){
    System.out.println(nums[r][i]);
  }
}
public static void reversePrint(int[][] nums ,int i){
  int nr = nums.length;
  for(int r = nr-1;r>=0;--r){
    System.out.println(nums[r][i]);
  }
}
public static void stateOfWakanda(int[][] nums){
  int nr = nums.length;
  int nc = nums[0].length;
  for(int i=0;i<nc;i++){
    if(i%2==0){
      // print in original order
      originalPrint(nums,i); 
    }else{
      // print in reverse order
      reversePrint(nums,i);

    }
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
    stateOfWakanda(nums);
    // return 0;
 }

}
