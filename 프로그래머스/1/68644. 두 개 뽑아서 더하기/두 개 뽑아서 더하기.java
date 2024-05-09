import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> arrList = new ArrayList();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                arrList.add(numbers[i] + numbers[j]);
            }
        }
        numbers = arrList.stream().mapToInt(x->x).distinct().toArray();
        Arrays.sort(numbers);
        return numbers;
    }
}