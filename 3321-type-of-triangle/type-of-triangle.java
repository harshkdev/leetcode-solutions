class Solution {
    public String triangleType(int[] nums) {
        for(int i =0; i < nums.length; i++){

            if(nums[i] + nums[i + 1] <= nums[i + 2] ||
              nums[i + 1] + nums[i + 2] <= nums[i] || 
              nums[i] + nums [i + 2] <= nums[i + 1]){
              return "none";
            }  

            else if(nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2]){
                return "equilateral";
            }
            else if( nums[i] != nums[i + 1] && nums[i + 1] != nums[i + 2] && nums[i + 2] != nums[i]){
                return "scalene";
            }else{
                return "isosceles";
            }
            
        }
        return "none";
        
    }
}