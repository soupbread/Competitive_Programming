import java.io.*;
import java.util.*;

public class Sac22cc4jp3 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer in;

    public static void main(String[] args) throws IOException {
        double n = readInt(), a = readInt();
        double smallest = 1e10;
        int ans = 0;
        for(int i=1;i<=n;i++){
            double x = readDouble(), y = readDouble();
            double angle = Math.toDegrees(Math.atan2(y,x));
            if(angle<0) angle+=360;
            double diff = Math.min(Math.abs(a-angle), 360-Math.abs(a-angle));
            if(diff<smallest){
                smallest = diff;
                ans=i;
            }
        }
        System.out.println(ans);
    }

    static String next() throws IOException {
        while (in == null || !in.hasMoreTokens())
            in = new StringTokenizer(br.readLine());
        return in.nextToken();
    }

    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }
}