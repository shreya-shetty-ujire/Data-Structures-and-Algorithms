package BinarySearchProb;

public class FirstElementInMountainArray {
    public static void main(String[] args){
        int[] array={1,2,3,4,5,3,1};
        int res=findInMountainArray(3,array);
        System.out.println(res);
    }
        static int findInMountainArray(int target, int[] mountainArr) {
            int peak = peakSearch(mountainArr);

            int res=binarySearchAscending(mountainArr,target,0,peak,true);
            if(res!=-1){
                res=binarySearchAscending(mountainArr,target,peak + 1, mountainArr.length- 1,false);
            }
            return res;
        }
        static int peakSearch(int[] mountainArr){
            int start=0;
            int end=mountainArr.length-1;
            while(start < end){ // start=end is not taken because that is the answer and we directly return the error
//            int mid=(start/end)/2; // might be possible that it exceeds the range of int after adding so better approach is:
                int mid=start+(end-start)/2;
                if(mountainArr[mid+1]>mountainArr[mid]){
                    start=mid+1;//here we know mid+1 ele is greater so mid+1 is taken
                }
                else{
                    end=mid; // here we donno whether mid-1 is greater so we are starting with mid
                }

            }
//        By the time start == end, we have pinpointed a single element that meets the peak condition, so start (or end, as they’re equal) is returned as the index of the peak.
            return start;
        }

        static int binarySearchAscending(int[] array, int element,int start,int end,boolean isAscending) {


            while ( start <= end ) {
//            int mid=(start/end)/2; // might be possible that it exceeds the range of int after adding so better approach is:
                int mid = start + (end - start) / 2;
                int midValue = array[mid];
                if(midValue==element){
                    return mid;
                }
                if(isAscending){
                    if (element < midValue) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
                else{
                    if (element >midValue) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }
            return -1;
        }
    }

