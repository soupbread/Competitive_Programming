import java.io.*;
import java.util.*;
public class Ccc21j1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer in;

    public static void main(String[] args) throws IOException {
        int p=readInt()*5-400;
        System.out.println(p);
        if(p<100) System.out.println(1);
        else if(p>100) System.out.println(-1);
        else System.out.println(0);

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