import java.io.*;

public class Ccc18j2_v2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt=Integer.parseInt(br.readLine()), count=0;
        String yesterday=br.readLine(), today=br.readLine();
        
        for(int i=0;i<cnt;i++){
            if(yesterday.charAt(i)=='C' && yesterday.charAt(i)==today.charAt(i)) count++;
        }
        System.out.println(count);
    }
}
