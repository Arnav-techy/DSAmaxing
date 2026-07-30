class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int pushes = 0;
        
        if (n <= 8) {
            pushes = n;
        } else if (n <= 16) {
            pushes = 8 + (n - 8) * 2;
        } else if (n <= 24) {
            pushes = 8 + 16 + (n - 16) * 3;
        } else {
            pushes = 8 + 16 + 24 + (n - 24) * 4;
        }
        
        return pushes;
    }
}