class Solution {
    public int[] scoreValidator(String[] events) {
        int score = 0;
        int counter = 0;

        for(int i = 0; i < events.length; i++){
            String even = events[i];

            switch (even){
            case "0":
            score += 0;
            break;

            case "1":
            score += 1;
            break;

            case "2":
            score += 2;
            break;

            case "3" :
            score += 3;
            break;

            case "4":
            score += 4;
            break;

            case "6" :
            score += 6;
            break;

            case "W" :
            counter += 1;
            break;

            case "WD" :
            score += 1;
            break;

            case "NB" :
            score += 1;
            break;
            }

            if(counter == 10){
                int ans []= new int [2];
                ans[0] = score;
                ans[1] = counter;
                return ans;
            
            }
            
            
        }
        
        int ans [] = new int[2];
        ans[0] = score;
        ans[1] = counter;
        return ans;
        
        
    }
    
}