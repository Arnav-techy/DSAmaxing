class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] s = new String[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        
       
        for (int i = 0; i < n; i++) {
            map.put(score[i], i);
        }
        
        
        Arrays.sort(score);
        
       
        for (int i = n - 1; i >= 0; i--) {
            int originalIndex = map.get(score[i]);
            
            if (i == n - 1) {
                s[originalIndex] = "Gold Medal";
            } else if (i == n - 2) {
                s[originalIndex] = "Silver Medal";
            } else if (i == n - 3) {
                s[originalIndex] = "Bronze Medal";
            } else {
                
                s[originalIndex] = String.valueOf(n - i);
            }
        }
        
        return s;
    }
}