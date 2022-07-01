import java.io.*;
import java.util.*;

public class Main {

    public static void swapHelper(int[][] nums,int i ,int start,int end){
      int temp = nums[i][start];
      nums[i][start] = nums[i][end];
      nums[i][end] = temp;
    }
    public static void swap(int[][] nums ,int start, int end){
      for(int i = 0;i<nums.length;i++){
        swapHelper(nums,i,start,end);
      }
    }
    public static void swapVals(int[][] nums,int i ,int j){
      /// swap nums[i][j] and nums[j][i]
      int temp = nums[i][j];
      nums[i][j] = nums[j][i];
      nums[j][i] = temp;
    }
    public static void transpose(int[][] nums){
      int nr = nums.length;
      int nc = nums[0].length;
      for(int i=0;i<nr;i++){
        for(int j = i+1;j<nc;j++){
            swapVals(nums,i,j);
        }
      }
    }
    public static void change(int[][] nums){
      transpose(nums);
      // now time to swap the columns
      int start = 0 ;
      int end = nums[0].length-1;
      while(start<=end){
        swap(nums,start,end);
        start++;
        end--;
      }
    }
    public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      int nr = scn.nextInt();
      // int nc = scn.nextInt();
      int[][] nums = new int[nr][nr];
      for(int i=0;i<nr;i++){
        for(int j=0;j<nr;j++){
          nums[i][j] = scn.nextInt();
        }
      }
      change(nums);
      display(nums);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
