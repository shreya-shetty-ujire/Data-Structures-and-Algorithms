package BinarySearchProb;
//Find First and Last Position of Element in Sorted Array
//Solved
//        Medium
//Topics
//        Companies
//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//
//If target is not found in the array, return [-1, -1].
//
//You must write an algorithm with O(log n) runtime complexity.
//Example 1:
//
//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
public class FirstandLastPos {
    public static void main(String[] args){
        int[] ans={-1,-1};
        int[] nums = {5,7,7,8,8,10};
        ans[0]=binary(nums,8,true);
        if(ans[0]!=-1)
            ans[1]=binary(nums,8,false);
        System.out.println(ans);
    }

    static int binary(int[] nums, int target,boolean findStartIndex) {
        int ans=-1;
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{

                ans=mid;
                if(findStartIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }

            }
        }
        return ans;
    }

}
