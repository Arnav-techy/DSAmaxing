class Solution {
    public boolean detectCapitalUse(String word) {
        int n=word.length();
        int up=0;
        for(char c:word.toCharArray()){
            if(Character.isUpperCase(c)){
                up++;
            }
        }
        if(up==n || up==0) return true;
        else if (up==1 && Character.isUpperCase(word.charAt(0))) return true;
        else return false;
        
    }
}