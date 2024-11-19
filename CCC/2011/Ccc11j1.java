import java.io.*;
import java.util.*;

public class Ccc11j1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer in;
	
	public static void main(String[] args) throws IOException {
	    int ant = readInt(), eyes = readInt();
		if (ant >= 3 && eyes <= 4) {
            System.out.println("TroyMartian");
        }
        if (eyes >=2 && ant <=6){
            System.out.println("VladSaturnian");
        }
        if(eyes <=3 && ant<=2){
            System.out.println("GraemeMercurian");
        }
	}
	
	static String next() throws IOException {
		while (in == null || !in.hasMoreTokens())
			in = new StringTokenizer(br.readLine());
		return in.nextToken();
	}

	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}
}