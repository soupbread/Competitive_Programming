import java.io.*;
import java.util.*;

public class Ccc19j2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer in;

    public static void main(String[] args) throws IOException {
        int cnt=readInt(), cnt2;
        char ch;
        for(int i=0;i<cnt;i++){
            cnt2=readInt();
            ch=readChar();
            for(int n=0;n<cnt2;n++){
                System.out.print(ch);
            }
            System.out.println();
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

    static char readChar() throws IOException {
        return next().charAt(0);
    }
}