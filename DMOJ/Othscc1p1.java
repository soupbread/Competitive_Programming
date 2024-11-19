import java.io.*;

public class Othscc1p1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        int num1=Integer.parseInt(br.readLine()), num2=Integer.parseInt(br.readLine());
        if(num1==0 || num2==0) System.out.println(0);
        else System.out.println(num1+num2);
    }
}