class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int y=x;
        while(y!=0){
            int digit=y%10;
            rev=rev*10+digit;
            y=y/10;
        }
        if(rev==x && x>=0){
            return true;
        }
        else{
            return false;
        }
        
    }
}