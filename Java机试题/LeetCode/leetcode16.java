package LeetCode;

import java.util.Arrays;

public class leetcode16 {
    public static void main (String args[]){
        int sum[] = {0,2,1,-3};
        System.out.println(threeSumClosest(sum,1));
    }
     static int threeSumClosest(int[] nums, int target) {
        int sum = -9999;
        int diff = 9999;
        int diff1 = 9999;
        if (nums == null || nums.length < 3) {
            return sum;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {

            //check for duplicate
            if (i > 0 && nums[i] == nums[i-1]) continue;

            //set params
            int results = nums[i];
            int lb = i + 1;
            int ub = nums.length - 1;
            while (lb < ub) {
                int compliment = nums[lb] + nums[ub] + results;
                diff = Math.abs(compliment - target);
                if(compliment == target){
                    return compliment;
                }

                else {
                    if(diff1>diff){
                        diff1 = diff;
                        sum = compliment;
                    }
                    if(compliment > target)
                        ub--;
                    else
                        lb++;

                }
            }
        }
        return sum;

    }

}
