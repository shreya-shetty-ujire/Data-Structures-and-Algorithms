package BinarySearchProb;

public class MaximuminArray {
    public static void main(String[] args){

    }
    static int binarySearch(int[] array,int element){
        int start=0;
        int end=array.length-1;
        while(start < end){ // start=end is not taken because that is the answer and we directly return the error
//            int mid=(start/end)/2; // might be possible that it exceeds the range of int after adding so better approach is:
            int mid=start+(end-start)/2;
            if(array[mid+1]>array[mid]){
                start=mid+1;//here we know mid+1 ele is greater so mid+1 is taken
            }
            else{
                end=mid; // here we donno whether mid-1 is greater so we are starting with mid
            }

        }
//        By the time start == end, we have pinpointed a single element that meets the peak condition, so start (or end, as they’re equal) is returned as the index of the peak.
        return start;
    }
}
