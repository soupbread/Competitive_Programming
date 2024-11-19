import java.io.*;
import java.util.*;
public class Ccc12j2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer in;

    public static void main(String[] args) throws IOException {
        int num = readInt(), num2=readInt();
        if(num2>num){
            num=num2;
            num2=readInt();
            if(num2>num){
                num=num2;
                num2=readInt();
                if(num2>num){
                    System.out.println("Fish Rising");
                    System.exit(0);
                }
                else{
                    System.out.println("No Fish");
                    System.exit(0);
                }
            }
            else{
                System.out.println("No Fish");
                System.exit(0);
            }
        }
        else if(num2<num){
            num=num2;
            num2=readInt();
            if(num2<num){
                num=num2;
                num2=readInt();
                if(num2<num){
                    System.out.println("Fish Diving");
                    System.exit(0);
                }
                else{
                    System.out.println("No Fish");
                    System.exit(0);
                }
            }
            else{
                System.out.println("No Fish");
                System.exit(0);
            }
        }
        else {
            num=num2;
            num2=readInt();
            if(num2==num){
                num=num2;
                num2=readInt();
                if(num2==num){
                    System.out.println("Fish At Constant Depth");
                    System.exit(0);
                }
                else{
                    System.out.println("No Fish");
                    System.exit(0);
                }
            }
            else{
                System.out.println("No Fish");
                System.exit(0);
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