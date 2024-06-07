class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        while(Math.abs(a - b) >= 1) {
            if(a % 2 == 0) a /= 2;
            else if(a % 2 != 0) a = (a + 1) / 2;
            
            if(b % 2 == 0) b/= 2;
            else if(b % 2 != 0) b = (b + 1) / 2;
            
            answer++;
        }

        return answer;
    }
}