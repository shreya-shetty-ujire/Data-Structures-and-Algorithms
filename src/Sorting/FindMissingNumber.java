package Sorting;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumber {
    public static void main(String[] args){
        int[] arr={4,3,2,7,8,2,3,1};
        List<Integer> res=findDisappearedNumbers(arr);

        System.out.println(res);
    }
    public static List <Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res=new ArrayList <>();
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]<nums.length && nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                res.add(j+1);
            }
        }
        return res;

    }
}
