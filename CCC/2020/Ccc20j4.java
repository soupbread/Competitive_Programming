import java.io.*;
public class Ccc20j4 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String t=readLine(), s=readLine();

        for(int i=0;i<s.length();i++){
            if(t.contains(s)){
                System.out.println("yes");
                return;
            }
            s = s.substring(1) + s.charAt(0);
        }
        System.out.println("no");
    }

    static String readLine() throws IOException {
        return br.readLine();
    }
}