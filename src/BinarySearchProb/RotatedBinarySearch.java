package BinarySearchProb;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] nums={2,2,2,5,1,3,2};
        int pivotele=pivot(nums);
        int ele=2;
        if(nums[pivotele]==ele){
            System.out.println(pivotele);
        }
        else {
            int res = binarySearch(nums, 0, pivotele - 1, ele);
            if (res != -1) {
                System.out.println(res);

            }
            else
            System.out.println(binarySearch(nums, pivotele + 1, nums.length - 1, ele));
        }
    }
    //without duplicates
        static int pivot(int[] nums){
            int start=0;
            int end=nums.length-1;

            while(start<=end){
                int mid=start+(end-start)/2;
                // 4 cases
                if(mid<end && nums[mid]>nums[mid+1]){ //arrayoutofbound
                    return mid;
                }
                else if(mid>start && nums[mid]<nums[mid-1]){// arrayoutofbound
                    return mid-1;
                }
                else if(nums[mid]<=nums[start]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            return -1;
        }
        //with duplicates
        static int pivotWithDuplicates(int[] nums){
            int start=0;
            int end=nums.length-1;

            while(start<=end){
                int mid=start+(end-start)/2;
                // 4 cases
                if(mid<end && nums[mid]>nums[mid+1]){ //arrayoutofbound
                    return mid;
                }
                if(mid>start && nums[mid]<nums[mid-1]){// arrayoutofbound
                    return mid-1;
                }
                if(nums[mid]==nums[start] && nums[mid]==nums[end]){
                    // before skipping the elements check whether they are pivot itself
                    if(nums[start]>nums[start+1]){
                        return start;
                    }
                    start++;
                    if(nums[end]<nums[end-1]){
                        return end;
                    }
                    end--;
                    if(nums[start]<nums[mid] || nums[start]==nums[mid] && nums[mid]>nums[end]){
                        start=mid+1;
                    }
                    else{
                        end=mid-1;
                    }
                }
            }
            return -1;
        }

        static int binarySearch(int[] nums,int start,int end,int element){
            while(start<=end){
                int mid=start+(end-start)/2;
                if(element>nums[mid]){
                    start=mid+1;
                }
                else if(element<nums[mid]){
                    end=mid-1;
                }
                else
                    return mid;
            }
            return -1;
        }

    }

