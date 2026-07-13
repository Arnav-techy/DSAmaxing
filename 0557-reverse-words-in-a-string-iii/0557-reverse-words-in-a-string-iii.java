class Solution {
    public String reverseWords(String s) {
        String [] a=s.split(" ");
        int n=a.length;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(a[i]);
            sb.reverse();
            a[i]=sb.toString();
            sb.setLength(0);
        }
        return String.join(" ",a);
    }
}