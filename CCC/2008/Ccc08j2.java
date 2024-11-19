import java.io.*;
import java.util.*;
public class Ccc08j2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer in;

    public static void main(String[] args) throws IOException {
        Deque<String> d = new ArrayDeque<>();
        d.add("A");
        d.add("B");
        d.add("C");
        d.add("D");
        d.add("E");

        while(true){
            int num=readInt();
            int max=readInt();
            String temp1, temp2;
            if(num==1){
                for(int cnt=0; cnt<max;cnt++) d.addLast(d.pollFirst());
            }
            if(num==2){
                for(int cnt=0; cnt<max;cnt++) {
                    d.addFirst(d.pollLast());
                }
            }
            if(num==3){
                for(int cnt=0; cnt<max;cnt++) {
                    temp1 = d.pollFirst();
                    temp2 = d.pollFirst();
                    d.addFirst(temp1);
                    d.addFirst(temp2);
                }
            }
            if(num==4){
                for(int cnt=0; cnt<max;cnt++){
                    while(!d.isEmpty()){
                        System.out.print(d.pollFirst()+" ");
                    }
                }
                break;
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