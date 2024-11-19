import java.io.*;

public class Ccc23j1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int p=Integer.parseInt(br.readLine());
        int c=Integer.parseInt(br.readLine());
        int score=p*50-c*10;
        
        if(p>c) score+=500;
        System.out.println(score);
    }
}