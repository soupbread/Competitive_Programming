import java.io.*;

public class Ccc18j1_v2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int prev=0;
        
        for(int i=0;i<4;i++){
            int curr=Integer.parseInt(br.readLine());
            if((i==0 || i==3) && curr!=8 && curr!=9){
                System.out.println("answer");
                return;
            }
            if(i==1) prev=curr;
            if(i==2 && curr!=prev){
                System.out.println("answer");
                return;
            
            }
        }
        System.out.println("ignore");
    }
}
