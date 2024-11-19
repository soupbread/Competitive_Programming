import java.io.*;
import java.util.*;

public class Ccc17j3 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer in;

    public static void main(String[] args) throws IOException {
        int x= readInt(), y=readInt();
        x=Math.abs(x-readInt());
        y=Math.abs(y-readInt());
        int battery=readInt();
        
        if(x+y<=battery && (battery-(x+y))%2==0) System.out.println("Y");
        else System.out.println("N");
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