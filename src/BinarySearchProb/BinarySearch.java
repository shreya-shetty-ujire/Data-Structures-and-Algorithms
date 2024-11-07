package BinarySearchProb;

public class BinarySearch {
    public static void main(String[] args){
        int[] a ={9,23,12,34,55,67,78};
        int target=11;
        System.out.println("Index:"+binarySearch(a,target));

    }
    static int binarySearch(int[] array,int element){
        int start=0;
        int end=array.length-1;
        while(start<=end){
//            int mid=(start/end)/2; // might be possible that it exceeds the range of int after adding so better approach is:
            int mid=start+(end-start)/2;
            if(element<array[mid]){
                end=mid-1;
            }
            else if(element>array[mid]){
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
