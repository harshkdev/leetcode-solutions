class Solution {
    public int getLeastFrequentDigit(int n) {

        int []freq = new int[10];

        while(n != 0){
            int lastdigit = n % 10;
            freq[lastdigit]++;
            n = n /10;
        }

        int min = Integer.MAX_VALUE;
        int ans=0;

        for(int i = 0; i < freq.length; i++){
                if(freq[i] > 0 && freq[i]<min){
                    min = freq[i];
                    ans = i;
                }
        }
       return ans; 
    }
    
}