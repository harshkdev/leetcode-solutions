class Solution {
    public String[] findRelativeRanks(int[] score) {

        String[] res = new String[score.length];

        for(int i = 0; i < score.length; i++) {

            int count = 0;

            for(int j = 0; j < score.length; j++) {

                if(score[j] > score[i]) {
                    count++;
                }
            }

            int rank = count + 1;

            if(rank == 1) {
                res[i] = "Gold Medal";
            }
            else if(rank == 2) {
                res[i] = "Silver Medal";
            }
            else if(rank == 3) {
                res[i] = "Bronze Medal";
            }
            else {
                res[i] = String.valueOf(rank);
            }
        }

        return res;
    }
}