import java.io.*;

public class Ccc12j1_v2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException{
        int l=Integer.parseInt(br.readLine()), s=Integer.parseInt(br.readLine()), f;
        
        if(s>l) {
            if(s-l<=20) f=100;
            else if(s-l<=30) f=270;
            else f=500;
            System.out.println("You are speeding and your fine is $"+f+".");
        }
        else System.out.println("Congratulations, you are within the speed limit!");
    }
}