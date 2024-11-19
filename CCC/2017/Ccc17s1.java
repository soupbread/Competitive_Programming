import java.util.*;
import java.io.*;

public class Ccc17s1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer in;

    public static void main(String[] args) throws IOException{
        int n=Integer.parseInt(br.readLine());
        int[] sw=new int[n], se=new int[n];

        for(int i=0;i<n;i++) sw[i]=Integer.parseInt(next());
        for(int i=0;i<n;i++) se[i]=Integer.parseInt(next());
        for(int i=1;i<n;i++){
            sw[i]=sw[i]+sw[i-1];
            se[i]=se[i]+se[i-1];
        }

        for(int i=n-1;i>=0;i--){
            if(sw[i]==se[i]){
                System.out.println(i+1);
                System.exit(0);
            }
        }
        System.out.println(0);
    }
    
    static String next() throws IOException {
        while (in == null || !in.hasMoreTokens())
            in = new StringTokenizer(br.readLine());
        return in.nextToken();
    }
}
