package Sorting;
// Given 1 to N numbers find the duplicate numbers
//There is only one repeated number in nums, return this repeated number.

//Input: nums = [1,3,4,2,2]
//Output: 2

public class FindDuplicateNumber {
    public static void main(String[] args){
        int[] arr={1,3,4,2,2};
        int s=findDuplicates(arr);
        System.out.println(s);
    }
    static int findDuplicates(int[] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]!=i+1){
                int correct=arr[i]-1;
                if(arr[i]!=arr[correct]){
                    int temp=arr[i];
                    arr[i]=arr[correct];
                    arr[correct]=temp;
                }
                else{
                    return arr[i];
                }

            }
            else{
                i++;
            }
        }
        return -1;
    }
}
