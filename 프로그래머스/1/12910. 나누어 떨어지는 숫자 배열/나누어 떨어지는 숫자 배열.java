import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                list.add(arr[i]);
            } 
        }
        if(list.size() == 0) return new int[] {-1};
        return list.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}