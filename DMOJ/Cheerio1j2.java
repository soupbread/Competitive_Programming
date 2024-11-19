import java.io.*;
import java.util.*;
public class Cheerio1j2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer in;

    public static void main(String[] args) throws IOException {
        int n=readInt(), t=readInt(), p, distance, prev=1000000001;
        String name, winner="";
        for(int i=0;i<n;i++){
            name=next();
            p=readInt();
            distance=Math.abs(t-p);
            if(distance<prev){
                prev=distance;
                winner=name;
            }
        }
        System.out.println(winner);
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