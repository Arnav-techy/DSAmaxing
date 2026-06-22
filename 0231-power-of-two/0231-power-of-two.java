class Solution {
    public boolean isPowerOfTwo(int n) {
        int i=0;
        while(Math.pow(2,i)<=n){
            if(n==Math.pow(2,i)){
                return true;
            }
            i++;
        }
        return false;
    }
}