package BinarySearchProb;

public class OrderAgnosticBinarySearch {
    // used when order of the array is not known
    public static void main(String[] args) {
        int[] a={56,45,23,22,21,12,10,9,4,2,1,-3};
        int[] a1={2,4,7,9,10,15,18,27,56,78,88,90};
        System.out.println("For Descending order:"+binarySearchAscending(a,9));
        System.out.println("For Ascending order:"+binarySearchAscending(a1,7));

    }

    static int binarySearchAscending(int[] array, int element) {
        int start = 0;
        int end = array.length - 1;

        // determine the order of sorting whether ascending/descending

        boolean isAscending = array[start] < array[end];

        while ( start <= end ) {
//            int mid=(start/end)/2; // might be possible that it exceeds the range of int after adding so better approach is:
            int mid = start + (end - start) / 2;
            if(array[mid]==element){
                return mid;
            }
            if(isAscending){
                if (element < array[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else{
                if (element > array[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}
