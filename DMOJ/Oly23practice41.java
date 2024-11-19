import java.io.*;

public class Oly23practice41 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String s=readLine();
        long a=0;
        for(int i=0;i<s.length();i++){
            a += (long) ((long) (s.charAt(i)-64)*Math.pow(26,s.length()-1-i));
        }
        System.out.println(a);
    }

    static String readLine() throws IOException {
        return br.readLine();
    }
}