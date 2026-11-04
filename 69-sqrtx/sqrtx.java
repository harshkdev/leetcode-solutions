class Solution {
    public int mySqrt(int x) {
        int sqrt = 0;

        while ((long)(sqrt + 1) * (sqrt + 1) <= x) {
            sqrt++;
        }

        return sqrt;
    }
}