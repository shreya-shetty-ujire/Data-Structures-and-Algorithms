package BinarySearchProb;

import java.util.Arrays;
//sorted row and column wise
public class BinarySearchIn2D {
    public static void main(String[] args){
        int[][] arr={
                {10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50
        }
        };
        int[] res=BS(arr,39);
        System.out.println(Arrays.toString(res));
    }

    static int[] BS(int[][] arr,int ele){
        int row=0;
        int col=arr.length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==ele){
                return new int[]{row,col};
            }

                if(arr[row][col]<ele){
                    row++;
                }
                else{
                    col--;
                }

        }
        return new int[]{-1,-1};
    }
}
