import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int result = 0;

        String binary = Integer.toBinaryString(input); // 10진수 -> 2진수
        char[] binaryChar = binary.toCharArray();

        for(int i = 0; i < binaryChar.length; i++) {
            if(binaryChar[i] == '1') result++;
        }

        System.out.println(result);
    }
}
