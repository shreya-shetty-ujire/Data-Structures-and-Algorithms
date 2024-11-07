package BinarySearchProb;
//Q:https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class InfiniteArrayElementsearch {
    public static void main(String[] args){
        int[] infiniteArray={25,66,77,88,99,121,126,178,190,200,210,217,250}; //basically infinite
// to solve this we do not make use of length of the array since it is infinite instead we use the small chunks of
// the array whose size increases exponentially for every call
        System.out.println(ans(infiniteArray, 126));
    }
    static int ans(int[] arr, int target) {
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]) {
            int temp = end + 1; // this is my new start
            // double the box value
            // end = previous end + sizeofbox*2
            end = end + (end - start + 1) * 2;
            if (end >= arr.length) {
                end = arr.length - 1;
                break;
            }
            start = temp;
        }
        return binarySearch(arr, start, end, target);

    }
    static int binarySearch(int[] array,int start,int end,int element){
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
