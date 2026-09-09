class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set < Integer > com = new HashSet<>();
        Set <Integer> common = new HashSet<>();

        for(int num: nums1){
            com.add(num);
        }
        for(int num1:nums2 )
        if(com.contains(num1)){
            common.add(num1);
        }
        int[] answer = new int[common.size()];

        int i = 0;
        for (int num : common) {
            answer[i] = num;
            i++;
        }
        return answer;
    }
}