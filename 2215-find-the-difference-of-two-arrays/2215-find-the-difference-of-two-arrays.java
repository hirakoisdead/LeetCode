class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        Set <Integer> first= new HashSet<>();
        Set <Integer> second= new HashSet<>();
        Set <Integer> dist= new HashSet<>();
        Set <Integer> finall= new HashSet<>();


        // Personal Note: first 2 loop will contain all elements from nums1 and nums2 in first and second
        for(int num:nums1){
            first.add(num);
        }
        for(int num2:nums2){
            second.add(num2);
        }
        
        // Personal Note: this loop will contain all elements for nums2 which are not in nums1
        for(int num3:nums2){
            if(!first.contains(num3)){
            dist.add(num3);
            }
        }
        
        // Personal Note: this loop will remove all nums2 elements from first and store in final
        for(int num4:first){
            if(!second.contains(num4)){
                finall.add(num4);
            }
        }

        // Personal Note: Convert the hashset to list as its the return type
        List<List<Integer>> answer = new ArrayList<>();

        answer.add(new ArrayList<>(finall));
        answer.add(new ArrayList<>(dist));

        return answer;

    }
}