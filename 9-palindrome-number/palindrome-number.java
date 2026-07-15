class Solution {
    public boolean isPalindrome(int x) {

            int orignal = x;
        	if(x < 0 || (x % 10 == 0 && x != 0))
            {
                return false;
            }

            int lastDigit ;
            int rev = 0;
		    
		    
		    while(0 < x){
                lastDigit = x % 10;
		        rev = rev * 10 + lastDigit;
		        x = x / 10;
            }
            if( rev == orignal){
                return true;
            }else{
                return false;
            }
                  
		
    }
    
   
}