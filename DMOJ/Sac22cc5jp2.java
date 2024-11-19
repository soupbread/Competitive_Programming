import java.io.*;
import java.util.*;

public class Sac22cc5jp2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer in;

    public static void main(String[] args) throws IOException {
        int n=readInt(), cnt=0;

        for(int i=0;i<n;i++){
            int m=readInt(), o=readInt();
            if(m>o){
                cnt++;
            }
        }
        System.out.println(cnt);
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