import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        LinkedList<Integer> dNumber = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            dNumber.offer(i + 1);
        }

        int cnt = 0;

        Integer[] points = new Integer[M];
        for (int i = 0; i < M; i++) {
            points[i] = sc.nextInt();
        }

        for (int i = 0; i < M; i++) {
            while (dNumber.peek() != points[i]) {
                if (dNumber.indexOf(points[i]) <= (dNumber.size() / 2)) {
                    int first = dNumber.peekFirst();
                    dNumber.offer(first);
                    dNumber.poll();
                    cnt++;
                } else {
                    int last = dNumber.peekLast();
                    dNumber.offerFirst(last);
                    dNumber.pollLast();
                    cnt++;
                }

            }
            dNumber.poll();
        }

        System.out.println(cnt);
    }
}