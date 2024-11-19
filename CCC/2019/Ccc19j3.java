import java.io.*;
import java.util.*;

public class Ccc19j3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt=Integer.parseInt(st.nextToken()), count=1;
        for(int i=0;i<cnt;i++){
            String in=br.readLine()+' ';
            for(int j=1;j<in.length();j++){
                if(in.charAt(j)!=in.charAt(j-1)){
                    System.out.print(count+" "+in.charAt(j-1)+" ");
                    count=1;
                }
                else count++;
            }
            System.out.println();
        }
    }
}