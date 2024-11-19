import java.io.*;
import java.util.*;

public class A4b1_v2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer in;

    public static void main(String[] args) throws IOException {
        int n=readInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=readInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
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