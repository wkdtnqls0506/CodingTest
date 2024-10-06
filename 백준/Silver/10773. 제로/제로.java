import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        Integer[] numbers = new Integer[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        Stack<Integer> numberStacks = new Stack<>();

        for(int i = 0; i < N; i++) {
            if(numbers[i] == 0) numberStacks.pop();
            else numberStacks.push(numbers[i]);
        }

        int result = numberStacks.stream().mapToInt(Integer::intValue).sum();

        System.out.println(result);
    }
}