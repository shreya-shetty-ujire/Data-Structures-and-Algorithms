package ArraysExamples;

import java.util.HashMap;

public class GoodPairs {
    public static void main(String[] args){
        int[] arr={1,2,3,1,1,3};
        int n=3;
        System.out.println(numIdenticalPairs(arr));
    }
    static int numIdenticalPairs(int[] nums) {

        HashMap <Integer, Integer> countMap = new HashMap<>();
        int goodPairs = 0;

        for (int num : nums) {
            // If the element already exists in the map, add the current count of that element to goodPairs
            if (countMap.containsKey(num)) {
                goodPairs += countMap.get(num);
            }

            // Update the count for the current element in the map
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        return goodPairs;
    }
}
