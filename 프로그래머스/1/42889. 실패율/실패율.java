import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] challengers = new int[N + 2];
        HashMap<Integer, Double> fail = new HashMap<>();
        double total = stages.length;
        
        for(int i = 0; i < stages.length; i++) {
            challengers[stages[i]] += 1;
        }
        
        for(int i = 1; i <= N; i++) {
            if(challengers[i] == 0) {
                fail.put(i, 0.0);
            } else {
                fail.put(i, challengers[i] / total);
                total -= challengers[i];
            }
        }
        
        return fail.entrySet().stream().sorted((o1, o2) -> Double.compare(o2.getValue(), o1.getValue())).mapToInt(HashMap.Entry::getKey).toArray();
    }
}