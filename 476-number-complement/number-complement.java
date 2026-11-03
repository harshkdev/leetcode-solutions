class Solution {
    public int findComplement(int num) {

        int result = 0;
        int place = 1;

        while (num > 0) {

            int rem = num % 2;

            if (rem == 0) {
                result = result + place;
            }

            num = num / 2;
            place = place * 2;
        }

        return result;
    }
}