import java.io.*;

public class Ccc10j1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException{
        int n=Integer.parseInt(br.readLine());
        
        if(n<=5) System.out.println(n/2+1);
        else {
            if(n==6) System.out.println(3);
            else if(n==7||n==8) System.out.println(2);
            else System.out.println(1);
        }
    }
}