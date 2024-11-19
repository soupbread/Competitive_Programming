import java.io.*;
import java.util.*;

public class Ccc23s1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer in;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        int[][] a = new int[2][n];
        for(int i=0;i<2;i++){
            for(int j=0;j<n;j++){
                a[i][j]=readInt();
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans += a[0][i]*3+a[1][i]*3;
            if(a[0][i]==1 && i>0 && a[0][i-1]==1) ans-=2;
            if(a[1][i]==1 && i>0 && a[1][i-1]==1) ans-=2;
            if(a[0][i]==1 && a[1][i] == 1 && i%2==0) ans-=2;
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
}