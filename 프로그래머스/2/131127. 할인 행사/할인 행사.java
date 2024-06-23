import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> wantMap = new HashMap<>();
        
        for(int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }
        
        for (int i = 0; i <= discount.length - 10; i++) {
            String[] arr1 = Arrays.copyOfRange(discount, i, i + 10); 
            Map<String, Integer> discountMap = new HashMap<>();
            
            for (int j = 0; j < arr1.length; j++) {
                discountMap.put(arr1[j], discountMap.getOrDefault(arr1[j], 0) + 1);
            }
            
            boolean match = true;
            
            for(String key : wantMap.keySet()) {
                if(wantMap.get(key) != discountMap.get(key)) {
                    match = false;
                    break;
                }
            }
            
            if(match) answer++;
        }
        return answer;
    }
}