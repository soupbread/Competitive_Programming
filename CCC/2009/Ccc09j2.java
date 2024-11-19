import java.io.*;
public class Ccc09j2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException{
        int trout=Integer.parseInt(br.readLine()), pike=Integer.parseInt(br.readLine()), pickerel=Integer.parseInt(br.readLine()), total=Integer.parseInt(br.readLine()), c=0;
        for(int i=0;i<=total;i++) {
            for(int j=0;j<=total;j++) {
                for(int n=0;n<=total;n++) {
                    if(i*trout+j*pike+n*pickerel<=total && i+j+n>0) {
                        System.out.print(i+" Brown Trout, "+j+" Northern Pike, "+n+" Yellow Pickerel\n");
                        c++;
                    }
                }
            }
        }
        System.out.println("Number of ways to catch fish: "+c);
    }
}