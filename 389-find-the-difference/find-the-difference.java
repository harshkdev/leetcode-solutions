class Solution {
    public char findTheDifference(String s, String t) {
        int res = 0;
        int res1 = 0;

        for(int i = 0; i < s.length(); i++){
            res += s.charAt(i) ;
        }

        for(int i = 0 ; i < t.length(); i++){
            res1 += t.charAt(i);
        }

        int ans = res1-res;
        char ch = (char) ans;

        return ch;
        
    }
    
}