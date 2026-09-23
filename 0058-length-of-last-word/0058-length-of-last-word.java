class Solution {
    public int lengthOfLastWord(String s) { int max=0; int save=0;

    for (int i=0; i<s.length(); i++){
        if(s.charAt(i) == ' '){
            max=0;
        }
        else{
            max++;
            save=max;
        }

    }
    if(save>max){
        return save;
    }
    return max;      
    }
}