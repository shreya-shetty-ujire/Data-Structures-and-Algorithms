package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr={5,4,3,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubbleSort(int[] arr){
        boolean isSwapped;

        for(int i=0; i<=arr.length-1;i++){
            isSwapped=false;
            for (int j=1;j<=arr.length-i-1;j++){

                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    isSwapped=true;
                }

            }
            // if there is no swap occured for whole pass i.e for some i then the
            if(!isSwapped){
                break;
            }
        }

    }
}
