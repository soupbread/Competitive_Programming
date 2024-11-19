import java.io.*;

public class Ccc19s1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();
        int hCnt=0, vCnt=0;
        
        for(int i=0;i<in.length();i++){
            if(in.charAt(i)=='H') hCnt++;
            if(in.charAt(i)=='V') vCnt++;
        }
        if(vCnt%2==1 && hCnt%2==1) System.out.println("4 3\n"+"2 1");
        else if(vCnt%2==1 && hCnt%2==0) System.out.println("2 1\n"+"4 3");
        else if(vCnt%2==0 && hCnt%2==1) System.out.println("3 4\n"+"1 2");
        else if(2%vCnt==0 && hCnt%2==0) System.out.println("1 2\n"+"3 4");
    }
}