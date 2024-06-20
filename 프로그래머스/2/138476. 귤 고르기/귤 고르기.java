import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : tangerine) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> list = new ArrayList<Integer>(map.values());
        Collections.sort(list, Collections.reverseOrder());
        for (int cnt : list) {
            if(k <= 0) break;
            k -= cnt;
            answer++;
        }
        return answer;
    }
}