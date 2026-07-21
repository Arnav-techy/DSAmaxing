class Solution {
    public boolean isPowerOfFour(int n) {
       if ((n > 0 && 1073741824 % n == 0 && n % 3 == 1) || n == 1)
       return true;
       else
       return false;
        
    }
}