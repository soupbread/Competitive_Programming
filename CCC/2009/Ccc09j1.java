import java.io.*;

public class Ccc09j1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException{
        int s=91;
        s+=Integer.parseInt(br.readLine());
        s+=Integer.parseInt(br.readLine())*3;
        s+=Integer.parseInt(br.readLine());
        System.out.println("The 1-3-sum is "+s);
    }
}