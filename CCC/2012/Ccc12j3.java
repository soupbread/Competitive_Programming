import java.io.*;
import java.util.*;

public class Ccc12j3 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(br.readLine());
        char[] c="*x*\n xx\n* *".toCharArray();
        ArrayList<Character> t=new ArrayList<>();
        
        for (char value : c) {
            if (value != '\n') {
                for (int j = 0; j < n; j++) t.add(value);
            }
            else{
                for(int m=0;m<n;m++){
                    for(int k=0;k<t.toArray().length;k++) System.out.print(t.get(k));
                    System.out.println();
                }
                t.clear();
            }
        }
        for(int m=0;m<n;m++){
            for(int k=0;k<t.toArray().length;k++) System.out.print(t.get(k));
            System.out.println();
        }
    }
}