package BinarySearchProb;

public class CountofRotatesInRotatedArray {
    public static void main(String[] args){
    int[] arr={4,5,6,7,0,1,2};
    int res=pivot(arr);
    if(res==-1){
        System.out.println("Array is not rotated");
    }
    else {
        System.out.println(res + 1);
    }
    }
    static int pivot(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            // 4 cases
            if(mid<end && arr[mid]>arr[mid+1]){ //arrayoutofbound
                return mid;
            }
            else if(mid>start && arr[mid]<arr[mid-1]){// arrayoutofbound
                return mid-1;
            }
            else if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
