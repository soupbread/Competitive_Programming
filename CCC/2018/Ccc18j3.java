import java.io.*;
import java.util.*;
public class Ccc18j3 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer in;

    public static void main(String[] args) throws IOException {
        int[] d=new int[4];
        int[] p=new int[5];
        for(int i=0;i<4;i++) d[i]=readInt();

        p[0]=0;
        for(int i=1;i<5;i++)p[i]=p[i-1]+d[i-1];

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i==j) {
                    if(i==4) System.out.print(0);
                    else System.out.print(0+" ");
                }
                else if(j>i){
                    if(j==4){
                        System.out.print(p[j]-p[i]);
                        System.out.println();
                    }
                    else{
                        System.out.print(p[j]-p[i]);
                        System.out.print(" ");
                    }
                }
                else{
                    System.out.print(Math.abs(p[j]-p[i]));
                    System.out.print(" ");
                }
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