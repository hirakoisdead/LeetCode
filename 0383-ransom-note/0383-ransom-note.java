class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> mag = new HashMap<>();
        HashMap<Character, Integer> ran = new HashMap<>();

        for(int i = 0; i < ransomNote.length(); i++){
            char c = ransomNote.charAt(i);
            ran.put(c, ran.getOrDefault(c, 0) + 1);
        }

        for(int i = 0; i < magazine.length(); i++){
            char c = magazine.charAt(i);
            mag.put(c, mag.getOrDefault(c, 0) + 1);
        }

        for(int i = 0; i < ransomNote.length(); i++){
            char c = ransomNote.charAt(i);

            if(!mag.containsKey(c) || ran.get(c) > mag.get(c)){
                return false;
            }
        }

        return true;
    }
}