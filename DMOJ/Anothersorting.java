import java.io.*;
import java.util.*;

public class Anothersorting {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer in;

    public static void main(String[] args) throws IOException {
        int n=readInt();
        List<Integer> nums = new ArrayList<>();
        for(int i=0;i<n;i++){
            int x=readInt();
            nums.add(x);
        }
        nums.sort((x,y)->{
            if(x%10 != y%10){
                return Integer.compare(x%10, y%10);
            }
            return -Integer.compare(x,y);
        });
        for(int x: nums){
            System.out.print(x+" ");
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
