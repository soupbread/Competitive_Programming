import java.io.*;
public class Ccc06j1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException{
        int t=0;

        for(int i=0;i<4;i++){
            int c=Integer.parseInt(br.readLine());
            
            if(i==0){
                if(c==1) t+=461;
                else if(c==2) t+=431;
                else if(c==3) t+=420;
            }
            else if(i==1){
                if(c==1) t+=100;
                else if(c==2) t+=57;
                else if(c==3) t+=70;
            }
            else if(i==2){
                if(c==1) t+=130;
                else if(c==2) t+=160;
                else if(c==3) t+=118;
            }
            else if(i==3){
                if(c==1) t+=167;
                else if(c==2) t+=266;
                else if(c==3) t+=75;
            }
        }
        System.out.println("Your total Calorie count is "+t+".");
    }
}
