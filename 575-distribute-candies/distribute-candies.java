class Solution {
    public int distributeCandies(int[] candyType) {

        int unique = 0;

        for (int i = 0; i < candyType.length; i++) {

            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (candyType[i] == candyType[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                unique++;
            }
        }

        if (unique < candyType.length / 2) {
            return unique;
        }

        return candyType.length / 2;
    }
}