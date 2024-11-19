import java.io.*;
import java.util.*;

public class Sac22cc4jp2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer in;

    public static void main(String[] args) throws IOException {
        int n = readInt(), q = readInt();
        String[] shape = new String[n], command;
        Arrays.fill(shape, "rhombus");
        for(int i=0;i<q;i++){
            command = br.readLine().split(" ");
            if(command[0].equals("set")){
                shape[Integer.parseInt(command[2]) - 1] = command[1];
            }
            else{
                System.out.println(shape[Integer.parseInt(command[2]) - 1].equals(command[1])? 1:0);
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