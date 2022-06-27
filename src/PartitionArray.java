/*
You are given an integer array nums and an integer k. You may partition nums into one or more subsequences such that each
 element in nums appears in exactly one of the subsequences.
Return the minimum number of subsequences needed such that the difference between the maximum and minimum values in each
 subsequence is at most k.
A subsequence is a sequence that can be derived from another sequence by deleting some or no elements without changing
the order of the remaining elements.
 */

import java.util.Arrays;

public class PartitionArray {
    /*
    //I tried this solution first, but it was unnecessarily complicated
    public int partition(int[] nums, int k) {
        if (nums[nums.length - 1] - nums[0] > k) {
            int smallArray[] = new int [nums.length/2];
            int bigArray[] = new int [nums.length - smallArray.length];
            for (int count = 0; count < nums.length/2; count++) {
                if(count < smallArray.length) {
                    smallArray[count] = nums[count];
                }
                else {
                    bigArray[count - smallArray.length] = nums[count];
                }
            }
            return partition(smallArray, k) + partition(bigArray, k);
        }
        else return 1;
    }
    public int partitionArray(int[] nums, int k) {
        //sort it first
        Arrays.sort(nums);
        return partition(nums, k);
    }

     */

    //here is a better solution, that I needed hints for
    public int partitionArray(int[] nums, int k) {
        if(nums.length==1) return 1;
        Arrays.sort(nums);
        int count=1,val=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(Math.abs(nums[i]-val)>k)
            {
                val=nums[i];
                count++;
            }
        }
        return count;
    }
}
