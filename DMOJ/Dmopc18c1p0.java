import java.io.*;
import java.util.*;

public class Dmopc18c1p0 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer in;

    public static void main(String[] args) throws IOException {
        int prev=readInt();
        for(int i=0;i<2;i++){
            int cur=readInt();
            if(cur<prev){
                System.out.println("Try again!");
                System.exit(0);
            }
            prev=cur;
        }
        System.out.println("Good job!");
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