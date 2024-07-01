import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
            if(stack.size() > 1 && stack.peek() == arr[i - 1]) {
                stack.pop();
            }
        }
        return stack.stream().mapToInt(i->i).toArray();
    }
}