import java.io.*;

public class Dmopc17c5p1_v2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String p = readLine();
        for(int i=0;i<p.length();i++){
            if(p.charAt(i)=='0') System.out.print('O');
            else if(p.charAt(i)=='1') System.out.print('l');
            else if(p.charAt(i)=='3') System.out.print('E');
            else if(p.charAt(i)=='4') System.out.print('A');
            else if(p.charAt(i)=='5') System.out.print('S');
            else if(p.charAt(i)=='6') System.out.print('G');
            else if(p.charAt(i)=='8') System.out.print('B');
            else if(p.charAt(i)=='9') System.out.print('g');
            else System.out.print(p.charAt(i));

        }
    }

    static String readLine() throws IOException {
        return br.readLine();
    }
}