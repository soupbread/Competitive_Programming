import java.io.*;

public class Ccc01j1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static InputStreamReader in;

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(br.readLine());

        for(int i=1;i<=n;i+=2){
            for(int j=0;j<i;j++) System.out.print("*");
            for(int k=0;k<2;k++){
                for(int j=0;j<n-i;j++) System.out.print(" ");
            }
            for(int j=0;j<i;j++) System.out.print("*");
            System.out.println();
        }
        
        for(int i=n-2;i>=1;i-=2){
            for(int j=0;j<i;j++) System.out.print("*");
            for(int k=0;k<2;k++){
                for(int j=0;j<n-i;j++) System.out.print(" ");
            }
            for(int j=0;j<i;j++) System.out.print("*");
            System.out.println();
        }
    }
}
