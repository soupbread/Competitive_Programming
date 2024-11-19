import java.io.*;
import java.util.*;

public class Ccc24j3 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException{
        int p=Integer.parseInt(br.readLine());
        int[] s=new int[p];
        for(int i=0;i<p;i++) s[i]=Integer.parseInt(br.readLine());
        Arrays.sort(s);

        int cnt=0, scnt=0, r=0;
        for(int i=s.length-1;i>0;i--){
            if(cnt<3){
                if(s[i]>s[i-1]){
                    cnt++;
                    if(cnt<3) r=s[i-1];
                    else r=s[i];
                }
            }
            else break;
        }
        for(int i=s.length-1;i>=0;i--){
            if(s[i]==r) scnt++;
        }
        System.out.println(r+" "+scnt);
    }
}