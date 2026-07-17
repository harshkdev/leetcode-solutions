class Solution {
    public int[] minCosts(int[] cost) {

        int mincost = Integer.MAX_VALUE;
        
        int res[] = new int[cost.length];
        for(int i = 0; i < cost.length; i++){
            mincost = Math.min(cost[i] , mincost);
            res[i] = mincost;
            
        }
        return res;
        
    }
   
}