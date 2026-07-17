class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char[] c=s.toCharArray();
        String vowels="aeiouAEIOU";
        while(i<j){
            while(i<j && !vowels.contains(String.valueOf(s.charAt(i)))){
                i++;
            }
            while(i<j && !vowels.contains(String.valueOf(s.charAt(j)))){
                j--;
            }

            if(i<j){
                char temp=c[i];
                c[i]=c[j];
                c[j]=temp;
                i++;
                j--;
            }

        }

        return new String(c);
    }
}