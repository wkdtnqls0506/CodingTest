import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int i = numbers.length - 1;
        Arrays.sort(numbers);
        return numbers[i] * numbers[i-1];
    }
}