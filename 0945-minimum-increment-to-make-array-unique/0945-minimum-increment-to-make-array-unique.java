class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i = 1; i < nums.length; i++) {
            while (true) {
                if (nums[i - 1] >= nums[i]) {
                    nums[i]++;
                    res++;
                } else {
                    break;
                }
            }
        }
        return res;
    }
}