
class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        for(int i=0;i<n/2;i++){
            char temp;
            temp=s[i];
            s[i]=s[n-1-i];
            s[n-1-i]=temp;
        }
       
        
    }
}