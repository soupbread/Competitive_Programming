import java.io.*;
import java.util.Arrays;

public class Othscc1p2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(br.readLine()), ans=0;
        int[] nums = new int[n];
        for(int i=0;i<n;i++) nums[i]=Integer.parseInt(br.readLine());
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++) ans+=nums[i];
        System.out.println(ans/(n-1));
    }
}