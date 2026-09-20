class Solution {
    public char repeatedCharacter(String s) {
        Set <Character> freq=new HashSet<>();

        for (int i=0; i<s.length();i++){
            char c=s.charAt(i);
            if(freq.contains(c)){
                return c;
            }
            else {
                freq.add(c);
            }
        }
        return '\0';
    }
}