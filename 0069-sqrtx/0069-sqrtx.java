class Solution {
    public int mySqrt(int x) {
        int high,low,mid;
       
        low=0;
        high=x;
        while(low<=high){
        mid = low+(high-low)/2;
        if((long)mid*mid==(long)x){
            return mid;
         }
         else if((long)mid*mid<(long)x){
            low=mid+1;
         }
         else{
            high=mid-1;
         }
         
        }
        return high;


        
    }
}