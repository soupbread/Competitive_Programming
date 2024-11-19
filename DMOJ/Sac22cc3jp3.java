import java.io.*;

public class Sac22cc3jp3 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    @SuppressWarnings("ConvertToStringSwitch")
    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(br.readLine());
        double p = 1;
        for(int i=0;i<n;i++){
            String event = br.readLine();
            if(event.equals("B")) p*=0.8;
            else if(event.equals("C")) p*=0.6;
            else if(event.equals("D")) p*=0.4;
            else if(event.equals("E")) p*=0.2;
        }
        System.out.printf("%.6g%n%n", p);
    }
}