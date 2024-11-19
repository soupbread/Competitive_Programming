import java.io.*;
import java.util.*;

public class Ccc14j1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer in;

    public static void main(String[] args) throws IOException {
        int angle1 = readInt(), angle2 = readInt(), angle3 = readInt();

        if (angle1 + angle2 + angle3 == 180) {
            if (angle1 == angle2 && angle1 == angle3) System.out.println("Equilateral");
            else if (angle1 != angle2 && angle1 != angle3 && angle2 != angle3) System.out.println("Scalene");
            else System.out.println("Isosceles");
        }
        else System.out.println("Error");
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