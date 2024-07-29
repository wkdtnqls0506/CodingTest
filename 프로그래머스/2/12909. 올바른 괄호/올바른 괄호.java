/*
    시간복잡도: O(N) + O(1) = O(N)
    -> s를 순회하며 괄호의 쌍을 확인 : O(N)
    -> Stack의 시간복잡도 : O(1)
*/

import java.util.*;

class Solution {
    boolean solution(String s) {
        char[] ch = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char c : ch) {
            if(c == '(') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}