class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> freq=new HashMap<>();

        for(int i:arr){
            freq.put(i, freq.getOrDefault(i,0)+1);
        }
        
        Set<Integer> unique=new HashSet<>();
        
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()){
            unique.add(entry.getValue());
        }

        for(int j:unique){
            if(freq.size() != unique.size()){
                return false;
            }
        }
        return true;
    }
}