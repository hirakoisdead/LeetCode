class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashMap <Integer, Integer> sol= new HashMap<>();

        for(int num: nums){
            if(sol.containsKey(num)){
                return true;
            }
            sol.put(num,1);
        }
        return false;
    }
}