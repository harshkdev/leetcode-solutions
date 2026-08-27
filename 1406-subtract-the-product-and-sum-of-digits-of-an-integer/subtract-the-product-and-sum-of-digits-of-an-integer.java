class Solution {
    public int subtractProductAndSum(int n) {
        int prod = 1;
        int sum = 0;
        int res = 0;
        

        while(n != 0){
            int ld = n % 10;
            sum += ld;
            prod *= ld;
            res = prod - sum;
            n = n /10;
        }
        return res;
        
    }
}