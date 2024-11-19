import java.util.Scanner;
import java.util.Arrays;

public class Dmopc14c5p2 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tunnelnum = sc.nextInt();
        int[] tunnels = new int[tunnelnum];
        int[] tunnel = new int[2];

        for (int n = 0; n < tunnelnum;n++) {
            for (int i = 0; i < 2; i++) {
                tunnel[i] = sc.nextInt();
            }
            tunnels[n] = tunnel[1]-tunnel[0];
        }
        Arrays.sort(tunnels);
        System.out.println(tunnels[tunnelnum-1]);
        sc.close();
    }
}