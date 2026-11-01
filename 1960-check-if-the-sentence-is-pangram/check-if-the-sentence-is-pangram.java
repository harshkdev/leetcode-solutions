class Solution {
    public boolean checkIfPangram(String sentence) {
        int [] res = new int [26];
        for(int i = 0; i < sentence.length(); i++){
            char ch = sentence.charAt(i);
            int index = ch - 'a';
            res[index]++;
        }
        for(int i = 0; i <26; i++){
            if(res[i] == 0){
                return false;
            }
        }
        return true;
    }
}