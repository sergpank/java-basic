import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSumBad(nums, 9)));
        System.out.println(Arrays.toString(twoSumGood(nums, 9)));
    }

    public static int[] twoSumGood(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        int[] result = {};
        for (int i : nums) {
            if (map.get(target - i) != null) {
                result = new int[]{map.get(i), map.get(target - i)};
            }
        }
        return result;
    }

    public static int[] twoSumBad(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}