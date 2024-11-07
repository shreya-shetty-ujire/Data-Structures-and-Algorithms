package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args){
        int[] arr={1,3,4,2,2,3};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correctIndex=arr[i]-1;   //5-1=4?


            if(arr[i]!=arr[correctIndex]){  //5!=4->No
                int temp=arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;
            }
            else{
                i++;
            }

            }


    }
}
