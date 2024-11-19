import java.io.*;

public class Ccc22j2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int players=Integer.parseInt(br.readLine()), cnt=0;

        for(int i=0;i<players;i++){
            if((Integer.parseInt(br.readLine())*5)-(Integer.parseInt(br.readLine())*3)>40) cnt++;
        }

        System.out.print(cnt);
        if(players==cnt) System.out.println("+");
    }
}