import java.io.*;
import java.util.*;

public class Sac22cc3p3 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer in;

    public static void main(String[] args) throws IOException {
        int len=readInt(), digits=0;
        List<String> nums = new ArrayList<>();
        for(int i=0;i<len;i++){
            String x=next();
            nums.add(x);
            digits=Math.max(digits, x.length());
        }
        for(int r=1;r<=digits; r++){
            int finalR = r;
            nums.sort((x, y)->{
                char x0=x.length() >= finalR ? x.charAt(x.length()- finalR) : '0';
                char y0=y.length() >= finalR ? y.charAt(y.length()- finalR) : '0';
                return Character.compare(x0,y0);
            });
            for(int i=0;i<len;i++){
                System.out.print(nums.get(i)+(i==len-1? "\n" : " "));
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