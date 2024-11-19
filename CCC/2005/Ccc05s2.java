import java.io.*;
import java.util.*;
public class Ccc05s2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer in;

    public static void main(String[] args) throws IOException {
        int c = readInt(), r = readInt(), x=0, y=0, newx=0, newy=0;
        boolean con = true;

        while(con){
            newx=readInt();
            newy=readInt();
            if(newx==0 && newy==0) break;

            else{
                x+=newx;
                y+=newy;

                if(x>=c) x=c;
                else if(x<=0) x=0;

                if(y>=r) y=r;
                else if(y<=0) y=0;

                System.out.println(x+" "+y);
            }
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