import java.io.*;
import java.util.*;

public class A4b1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt=Integer.parseInt(br.readLine());
        int[] nums = new int[cnt];
        
        for(int i=0;i<cnt;i++){
            nums[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(nums);
        for(int i=0;i<cnt;i++){
            System.out.println(nums[i]);
        }
    }
}