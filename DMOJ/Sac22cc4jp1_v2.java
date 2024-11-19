import java.io.*;

public class Sac22cc4jp1_v2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String word = br.readLine();
        int cnt=0;
        for(int i=0;i<5;i++){
            if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u' || word.charAt(i)=='y') cnt++;
        }
        System.out.println(cnt>=2? "good":"bad");
    }

}
