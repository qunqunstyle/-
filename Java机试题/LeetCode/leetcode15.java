package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode15 {

   public List<List<Integer>> threeSum(int[] nums) {

       List<List<Integer>> results = new ArrayList<> ();
       if (nums == null || nums.length < 3) return results;

       Arrays.sort(nums);


       for (int i = 0; i < nums.length - 2; i++) {

           //check for duplicate
           if (i > 0 && nums[i] == nums[i-1]) continue;

           //set params
           int target = -nums[i];
           int lb = i + 1;
           int ub = nums.length - 1;
           twoSum(nums, results, target, lb, ub);
       }
       return results;
   }

    private void twoSum(int[] nums, List<List<Integer>> results, int target, int lb, int ub){
        while (lb < ub) {
            int compliment = nums[lb] + nums[ub];
            if (compliment == target) {

                //target found - add to list
                results.add(Arrays.asList(-target, nums[lb], nums[ub]));

                //move markers
                lb++;
                ub--;

                //manage repeats
                while (lb < ub && nums[lb] == nums[lb-1]) lb++;
                while (lb < ub && nums[ub] == nums[ub+1]) ub--;
            }
            else if (compliment > target) ub--;
            else if (compliment < target) lb++;
        }
    }
}
