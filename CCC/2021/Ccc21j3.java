import java.io.*;
import java.util.*;
public class Ccc21j3 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer in;

    public static void main(String[] args) throws IOException {
        Stack<Integer> digits = new Stack<>();
        String prev="";
        int num=readInt();
        
        while (num!=99999){
            while(num!=0) {
                digits.push((num % 10));
                num /= 10;
            }
            if(digits.size()<4){
                System.out.println(prev+" "+digits.pop().toString()+digits.pop().toString()+digits.pop().toString());
            }
            else {
                if(digits.size()==4){
                    digits.push(0);
                }
                int sum = digits.pop() + digits.pop();
                if (sum % 2 == 0) {
                    System.out.println("right " + digits.pop().toString() + digits.pop().toString() + digits.pop().toString());
                    prev = "right";
                }
                else {
                    System.out.println("left " + digits.pop().toString() + digits.pop().toString() + digits.pop().toString());
                    prev = "left";
                }
            }
            num=readInt();
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