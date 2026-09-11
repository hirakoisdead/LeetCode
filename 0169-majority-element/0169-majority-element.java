class Solution {
    public int majorityElement(int[] nums) {int ans;

        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i:nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        
        // PN: Go through this concept once more

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
         if (entry.getValue() > nums.length / 2) {
         return entry.getKey();
        }
        }
        return -1;
    }
}