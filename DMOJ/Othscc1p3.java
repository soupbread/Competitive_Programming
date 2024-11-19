import java.io.*;
import java.util.*;
public class Othscc1p3 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer in;

    public static void main(String[] args) throws IOException {
        int n=readInt(), d=readInt(), cnt=1, e=1, max=1;
        int[] nums=new int[n];
        for(int i=0;i<n;i++) nums[i]=readInt();
        for(int i=1;i<n;i++){
            if(Math.abs(nums[i]-nums[i-1])>d){
                if(e>max) max=e;
                cnt++;
                e=1;
            }
            else e++;
        }
        if(e==n) max=e;
        System.out.println(cnt);
        System.out.println(max);
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