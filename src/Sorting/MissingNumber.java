package Sorting;

// Given 1 to N numbers find the missing element in array in O(n) complexity
public class MissingNumber {
    public static void main(String[] args){
        int[] arr={3,0,1};
        int s=cyclicSort(arr);
        System.out.println(s);
    }
    static int cyclicSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correctIndex]){
                int temp=arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;
            }
            else{
                i++;
            }

        }
        for(int j=0;j< arr.length;j++){
            if(arr[j]!=j){
                return j;
            }

        }
        return arr.length;
    }
}
