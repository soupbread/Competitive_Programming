import java.io.*;

public class Ccc12j2_v2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{
        int[] fish = new int[4];

        for(int i=0;i<4;i++) fish[i]=Integer.parseInt(br.readLine());
        
        if(fish[0]==fish[1] && fish[1]==fish[2] && fish[2]==fish[3]) System.out.println("Fish At Constant Depth");
        else if(fish[0]>fish[1] && fish[1]>fish[2] && fish[2]>fish[3]) System.out.println("Fish Diving");
        else if(fish[0]<fish[1] && fish[1]<fish[2] && fish[2]<fish[3]) System.out.println("Fish Rising");
        else System.out.println("No Fish");
    }
}