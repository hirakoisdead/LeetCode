class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> indexm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int need = target - nums[i];

            if (indexm.containsKey(need)) {
                return new int[] {indexm.get(need), i};
            }

            indexm.put(nums[i], i);
        }

        return new int[] {};
    }
}