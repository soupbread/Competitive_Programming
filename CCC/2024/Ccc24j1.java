import java.io.*;

public class Ccc24j1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException{
        int a=0;
        a+=Integer.parseInt(br.readLine())*3;
        a+=Integer.parseInt(br.readLine())*4;
        a+=Integer.parseInt(br.readLine())*5;
        System.out.println(a);
    }
}