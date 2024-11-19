import java.io.*;

public class Ccc12j4 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException{
        int k=Integer.parseInt(br.readLine());
        char[] c=br.readLine().toCharArray();
        
        for(int i=0;i<c.length;i++) System.out.print(((c[i]-(3*(i+1)+k))<65)? (char) (90-(64-(c[i]-(3*(i+1)+k)))) : (char) (c[i]-(3*(i+1)+k)));
    }
}