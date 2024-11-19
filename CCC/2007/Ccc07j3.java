import java.io.*;
import java.util.*;
public class Ccc07j3 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer in;

    public static void main(String[] args) throws IOException {
        int n = readInt(), ans=0;
        int[] a = {100, 500, 1000, 5000, 10000, 25000, 50000, 100000, 500000, 1000000};
        for(int i=0;i<n;i++) a[readInt()-1]=0;
        for (int j : a) ans += j;
        ans/=10-n;
        System.out.println(readInt()>ans? "deal":"no deal");
    }

    static String next() throws IOException {
        while (in == null || !in.hasMoreTokens())
            in = new StringTokenizer(br.readLine());
        return in.nextToken();
    }

    static long readLong() throws IOException {
        return Long.parseLong(next());
    }

    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static char readChar() throws IOException {
        return next().charAt(0);
    }

    static String readLine() throws IOException {
        return br.readLine();
    }
}
