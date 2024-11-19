import java.io.*;
import java.util.*;

public class Ccc17s2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer in;

    public static void main(String[] args) throws IOException {
        int n=readInt(), m;
        ArrayList<Integer> lows = new ArrayList<>();
        ArrayList<Integer> highs = new ArrayList<>();
        int[] tides = new int[n];

        for(int i=0;i<n;i++) tides[i]=readInt();
        Arrays.sort(tides);
        if(n%2==0) m=tides[n/2-1];
        else m=tides[n/2];

        for(int i=0;i<n;i++){
            if(tides[i]<=m) lows.add(tides[i]);
            else highs.add(tides[i]);
        }

        lows.sort(Comparator.reverseOrder());
        highs.sort(Comparator.naturalOrder());

        for(int i=0;i<Math.max(lows.toArray().length, highs.toArray().length);i++){
            if(i>=lows.toArray().length){
                if(i==highs.toArray().length-1) System.out.print(highs.get(i));
                else System.out.print(highs.get(i)+" ");
            }
            else if(i>=highs.toArray().length){
                if(i==lows.toArray().length-1) System.out.print(lows.get(i));
                else System.out.print(lows.get(i)+" ");
            }
            else{
                if(i==lows.toArray().length-1 && i==highs.toArray().length-1) System.out.print(lows.get(i)+" "+highs.get(i));
                else System.out.print(lows.get(i)+" "+highs.get(i)+" ");
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