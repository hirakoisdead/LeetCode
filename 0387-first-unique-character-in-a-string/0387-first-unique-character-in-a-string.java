class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character, Integer> freq=new HashMap<>();

        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            freq.put(c, freq.getOrDefault(c,0)+1);
        }

        for(int j=0; j <s.length(); j++){
            char c2= s.charAt(j);
            if(freq.get(c2) == 1){
                return j;
            }
        }
        return -1;
    }
}