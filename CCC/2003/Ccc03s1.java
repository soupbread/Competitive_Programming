import java.io.*;
import java.util.*;

public class Ccc03s1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer in;

    public static void main(String[] args) throws IOException {
        int player=1, roll=0;
        boolean continueV=true;

        while(continueV){
            roll=readInt();
            if(roll==0){
                System.out.println("You Quit!");
                continueV=false;
            }
            else if(player+roll>100){
                System.out.println("You are now on square "+player);
            }
            else{
                player+=roll;
                if(player==100){
                    System.out.println("You are now on square "+player);
                    System.out.println("You Win!");
                    continueV=false;
                }
//                else if(player>100){
//                    player=100-(player-100);
//                    System.out.println("You are now on square "+player);
//                }
                //ladders
                else if(player==9){
                    player=34;
                    System.out.println("You are now on square "+player);
                }
                else if(player==40){
                    player=64;
                    System.out.println("You are now on square "+player);
                }
                else if(player==67){
                    player=86;
                    System.out.println("You are now on square "+player);
                }
                //snakes
                else if(player==54){
                    player=19;
                    System.out.println("You are now on square "+player);
                }
                else if(player==90){
                    player=48;
                    System.out.println("You are now on square "+player);
                }
                else if(player==99){
                    player=77;
                    System.out.println("You are now on square "+player);
                }
                else{
                    System.out.println("You are now on square "+player);
                }
            }
        }
    }

    static String next() throws IOException {
        while (in == null || !in.hasMoreTokens())
            in = new StringTokenizer(br.readLine());
        return in.nextToken();
    }

    static long readLong() throws IOException {
        return Long.parseLong(next());
    }

    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static char readChar() throws IOException {
        return next().charAt(0);
    }

    static String readLine() throws IOException {
        return br.readLine();
    }
}
