import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        for (String cName : completion) {
            hashMap.put(cName, hashMap.getOrDefault(cName, 0) + 1);
        }
        
        for (String pName : participant) {
            if (hashMap.getOrDefault(pName, 0) == 0) answer += pName;
            hashMap.put(pName, hashMap.getOrDefault(pName, 0) - 1);
        }

        return answer;
    }
}