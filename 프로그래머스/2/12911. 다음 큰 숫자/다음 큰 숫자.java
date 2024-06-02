class Solution {
    public int solution(int n) {
        int n_count = Integer.bitCount(n);
        while(true) {
            n++;
            if(n_count == Integer.bitCount(n)) return n;
        }
     
    }
}