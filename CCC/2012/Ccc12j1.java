import java.io.*;
import java.util.*;

public class Ccc12j1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer in;

    public static void main(String[] args) throws IOException {
        int limit = readInt(), speed = readInt();
        
        if (speed > limit) {
            if (speed - limit <= 20) System.out.println("You are speeding and your fine is $100.");
            else if (speed - limit <= 30) System.out.println("You are speeding and your fine is $270.");
            else if (speed - limit >= 31) System.out.println("You are speeding and your fine is $500.");
        }
        else System.out.println("Congratulations, you are within the speed limit!");
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
