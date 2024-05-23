import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Integer[] numsArray = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Set<Integer> set = new HashSet(Arrays.asList(numsArray));
        return set.size() > nums.length / 2 ? nums.length / 2 : set.size();
    }
}