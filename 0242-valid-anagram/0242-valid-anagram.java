class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap <Character, Integer> freq1=new HashMap<>();
        HashMap <Character, Integer> freq2=new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            freq1.put(c, freq1.getOrDefault(c, 0) + 1);

        }
        for(int j=0; j<t.length(); j++){
            char d = t.charAt(j);

            freq2.put(d, freq2.getOrDefault(d, 0) + 1);

        }
        return freq1.equals(freq2);

    }
}