package BinarySearchProb;

public class ceilingnfloorOfNumber {
    public static void main(String[] args){
        int[] a={2,5,8,10,45,67};
        System.out.println(ceiling(a,68));
    }

    // smallest number that is greater or equal to target
    static int ceiling(int[] a,int ele) {
        int start=0;
        int end=a.length-1;

        //what if the target is greater than the greatest element in the array then return -1
        if(ele>a[end]){
            return -1;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(a[mid]==ele){
                return a[mid];
            }
            else if(ele>a[mid]){
                    start=mid+1;
                }
            else
                end=mid-1;

            }
        return a[start];
    }
    // greatest number that is smaller or equal to target
    static int floor(int[] a,int ele) {
        int start=0;
        int end=a.length-1;
        // what if the target is lower than the lowest6 element in the array then return -1
        if(ele<a[start]){
            return -1;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(a[mid]==ele){
                return a[mid];
            }
            else if(ele>a[mid]){
                start=mid+1;
            }
            else
                end=mid-1;

        }
        return a[end];
    }

}

