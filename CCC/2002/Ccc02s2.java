import java.io.*;
import java.util.*;

public class Ccc02s2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer in;

    public static void main(String[] args) throws IOException {
        int num = readInt();
        int den = readInt();
        int gcf = 1;

        for (int i=1;i<=den;i++){
            if (num%i == 0 && den%i == 0){
               gcf = i;
            }
        }

        if (num % den == 0){
            System.out.println(num/den);
        }
        else if (num < den){
            System.out.println(num/gcf+"/"+den/gcf);
            }

        else if (num > den){ //improper fraction
            System.out.println(num/den+" "+num%den/gcf+"/"+den/gcf);
        }
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
