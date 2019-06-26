package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode18 {
    public static void main(String args[]){
        int num [] = {1,0,-1,0,-2,2};
         List<List<Integer>> list = new ArrayList<>();
         list = fourSum(num,0);
         System.out.println(list);

    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 4) return res;
        Arrays.sort(nums);
        if (nums[0] + nums[1] + nums[2] + nums[3] > target ||
                nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3] + nums[nums.length - 4] < target)
            return res;
        int len_3 = nums.length - 3;
        int len_2 = nums.length - 2;
        int len_1 = nums.length - 1;
        int last_i = nums[0] - 1;
        for (int i = 0; i < len_3; i++) {
            if (nums[i] == last_i)
                continue;
            last_i = nums[i];
            int last_j = last_i - 1;
            for (int j = i + 1; j < len_2; j++) {
                if (nums[j] == last_j)
                    continue;
                last_j = nums[j];
                int innerTarget = target - last_i - last_j;
                if (nums[j + 1] + nums[j + 2] > innerTarget || nums[nums.length - 1] + nums[nums.length - 2] < innerTarget)
                    continue;
                int left = j + 1, right = len_1;
                while (left < right) {
                    int innerSum = nums[left] + nums[right];
                    if (innerSum == innerTarget) {
                        res.add(Arrays.asList(last_i, last_j, nums[left], nums[right]));
                        left++;
                        right--;
                        while (nums[left] == nums[left - 1] && left < right) left++;
                        while (nums[right] == nums[right + 1] && left < right) right--;
                    } else if (innerSum < innerTarget) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return res;
    }
}
