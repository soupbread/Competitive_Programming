import java.io.*;
import java.util.*;

public class Ccc15s1_v2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer in;

    public static void main(String[] args) throws IOException {
        Stack<Integer> nums = new Stack<>();
        int total=0, inp, amount=readInt();

        for (int i = 0; i < amount; i++) {
            inp=readInt();
            if (inp==0&&i>= 1) nums.pop();
            else nums.push(inp);
        }

        while (!nums.isEmpty()) total += nums.pop();
        System.out.println(total);
    }

    static String next() throws IOException {
        while (in == null || !in.hasMoreTokens())
            in = new StringTokenizer(br.readLine());
        return in.nextToken();
    }

    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }
}