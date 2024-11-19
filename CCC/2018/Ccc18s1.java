import java.util.*;
import java.io.*;

public class Ccc18s1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer in;

    public static void main(String[] args) throws IOException{
        int n=Integer.parseInt(next());
        double a=0, size;
        Integer[] nums=new Integer[n];

        for(int i=0;i<n;i++) nums[i]=Integer.valueOf(next());
        Arrays.sort(nums);

        for(int i=1;i<nums.length;i++){
            if(i==nums.length-1) break;
            size=((nums[i]-nums[i-1])/2.0)+((nums[i+1]-nums[i])/2.0);
            if(i==1) a=size;
            if(size<a) a=size;
        }
        System.out.printf("%.1f\n", a);
    }
    
    static String next() throws IOException {
        while (in == null || !in.hasMoreTokens())
            in = new StringTokenizer(br.readLine());
        return in.nextToken();
    }
}