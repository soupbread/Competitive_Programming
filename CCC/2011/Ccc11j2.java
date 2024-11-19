import java.io.*;

public class Ccc11j2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException{
        int h=Integer.parseInt(br.readLine()), m=Integer.parseInt(br.readLine());
        
        for(int i=1;i<=m;i++){
            if(-6*Math.pow(i,4)+h*Math.pow(i,3)+2*Math.pow(i,2)+i<=0){
                System.out.println("The balloon first touches ground at hour:\n" + i);
                System.exit(0);
            }
        }
        System.out.println("The balloon does not touch ground in the given time.");
    }
}