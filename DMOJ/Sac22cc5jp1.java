import java.io.*;
import java.util.*;

public class Sac22cc5jp1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer in;

    @SuppressWarnings("unused")
    public static void main(String[] args) throws IOException {
        int x=readInt(), t=readInt(), w=readInt();
        System.out.println(w-x);
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