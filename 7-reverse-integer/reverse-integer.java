class Solution {
    public int reverse(int x) {
        int lastDigit;
        int rev = 0;

        boolean neg = false;
        int lastdigit = x % 10;

        
        if(x < 0){
            x = -x;
            neg = true;
        }
        while( x > 0){
            if( rev > Integer.MAX_VALUE / 10 || rev == Integer.MAX_VALUE && lastdigit > 7 ){
            return 0;
            }

            if(rev < Integer.MIN_VALUE / 10 || rev == Integer.MIN_VALUE && lastdigit < -8){
            return 0;
            }
            lastDigit = x % 10;
            rev = rev * 10 + lastDigit;
            x = x /10;
        }
        
        if(neg){
            return - rev;
        }
        return rev;
        
    }
}