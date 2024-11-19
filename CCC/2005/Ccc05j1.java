import java.io.*;
import java.text.DecimalFormat;

public class Ccc05j1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) throws IOException{
        int dm=Integer.parseInt(br.readLine());
        int em=Integer.parseInt(br.readLine());
        int wm=Integer.parseInt(br.readLine());
        int a=0, b=0;

        if(dm>100) a+=(dm-100)*25;
        if(dm>250) b+=(dm-250)*45;

        a+=em*15+wm*20;
        b+=em*35+wm*25;

        System.out.println("Plan A costs "+df.format((double)a/100));
        System.out.println("Plan B costs "+df.format((double)b/100));
        
        if(a>b) System.out.println("Plan B is cheapest.");
        else if(a<b) System.out.println("Plan A is cheapest.");
        else System.out.println("Plan A and B are the same price.");
    }
}
