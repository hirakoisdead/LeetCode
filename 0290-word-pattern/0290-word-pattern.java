class Solution {
    public boolean wordPattern(String pattern, String s) {

        HashMap<Character, String> bind = new HashMap<>();
        Set<String> unique = new HashSet<>();

        String[] words = s.split(" ");

        if(pattern.length() != words.length){
            return false;
        }

        for(int i = 0; i < pattern.length(); i++){

            char ch = pattern.charAt(i);
            String w = words[i];

            if(bind.containsKey(ch) && !bind.get(ch).equals(w)){
                return false;
            }

            if(unique.contains(w) && !bind.containsKey(ch)){
                return false;
            }

            bind.put(ch, w);
            unique.add(w);
        }

        return true;
    }
}