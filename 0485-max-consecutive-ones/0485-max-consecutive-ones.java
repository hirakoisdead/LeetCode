class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int prevc = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                prevc++;

                if (max < prevc) {
                    max = prevc;
                }
            } else {
                prevc = 0;
            }
        }

        return max;
    }
}