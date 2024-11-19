import java.util.*;

public class Ccc15s1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> nums = new Stack<>();
        int total = 0, current, amount = sc.nextInt();

        for (int i = 0; i < amount; i++) {
            current = sc.nextInt();
            if (current == 0 && i >= 1) {
                nums.pop();
            } else {
                nums.push(current);
            }
        }

        while (!nums.isEmpty()) {
            total += nums.pop();
        }
        System.out.println(total);
        sc.close();
    }
}