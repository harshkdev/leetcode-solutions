class Solution {
    public int minElement(int[] nums) {
        int max = Integer.MAX_VALUE;

        for(int i =0; i < nums.length; i++){
            int sum = 0;
            
            while(nums[i] != 0){
                int ld = nums[i] % 10;
                sum = sum + ld;
                nums[i] = nums[i] /10;

                
            }
            if( sum < max){
                    max = sum;
            }
           

        }
        return max;
        
    }
}