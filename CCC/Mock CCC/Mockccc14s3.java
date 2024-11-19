import java.io.*;
import java.util.*;

public class Mockccc14s3 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer in;

    public static void main(String[] args) throws IOException {
        int r=readInt(), c=readInt();
        int[][] a = new int[r][c];
        for(int i=0;i<r;i++){
            for(int m=0;m<c;m++){
                a[i][m]=readInt();
            }
        }
        for(int n=readInt();n>0;n--){
            int col=readInt()-1;
            Arrays.sort(a, (x,y)->{
                return Integer.compare(x[col],y[col]);
            });
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j] + (j==c-1? "\n":" "));
            }
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