package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr={5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void selectionSort(int[] arr) {

        for(int i=0;i<arr.length;i++){

            int last=arr.length-i-1;

            // find the maximum element in the array and put it to the last index
            int maxIndex=findMax(arr,0,last);

            int temp=arr[maxIndex];
            arr[maxIndex]=arr[last];
            arr[last]=temp;
        }

    }

     static int findMax(int[] arr, int start, int last) {
        int max=start;
        for(int i=start;i<=last;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
}
