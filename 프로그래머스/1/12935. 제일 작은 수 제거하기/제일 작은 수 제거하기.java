import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        if (arr.length > 1) {
            return Arrays.stream(arr).filter(i -> i != min).toArray();
        } else {
            return new int[] {-1};
        }
    }
}