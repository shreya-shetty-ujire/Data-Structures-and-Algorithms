package ArraysExamples;

import java.util.Arrays;

//https://leetcode.com/problems/shuffle-the-array/
public class shuffleArray {
    public static void main(String[] args){
        int[] arr={2,5,1,3,4,7};
        int n=3;
        System.out.println(Arrays.toString(shuffle(arr,n)));
    }
    static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];

        // Use two pointers, one for the x-part and one for the y-part
        int xIndex = 0; // Starting index of x elements
        int yIndex = n; // Starting index of y elements

        // Fill the result array by picking from x and y alternatively
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[xIndex++];     // Place xi
            result[2 * i + 1] = nums[yIndex++]; // Place yi
        }

        return result;
    }
}