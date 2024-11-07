package Sorting;

import java.util.ArrayList;
import java.util.List;

public class findAllDuplicates {
    public static void main(String[] args){
        int[] arr={1,3,4,3,2,2};
        List <Integer> s=allDuplicates(arr);
        System.out.println(s);
    }
    static List<Integer> allDuplicates(int[] nums){
        List <Integer> res=new ArrayList <>();
        int i=0;
        while(i<nums.length){

                int correct=nums[i]-1;
                if(nums[i]!=nums[correct]) {
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;
                }
                else{
                   i++;
                }
            }

        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                res.add(nums[j]);
            }
        }
        return res;

    }
}


