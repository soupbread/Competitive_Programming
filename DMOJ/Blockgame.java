import java.util.Scanner;
 
public class Blockgame {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numofgames = sc.nextInt();
        int numofkills = sc.nextInt();
        int numofdeaths = sc.nextInt();
        // STORING KILL TO DEATH RATIO
        double jwktdratio = sc.nextDouble();
 
        // assigning values
 
        // GAME KILL N DEATH INPUTS
        for (int o = 0; o < numofgames; o++) {
            numofkills += sc.nextInt();
            numofdeaths += sc.nextInt();
        }
 
        // STOP HACKING!!
        if (numofdeaths == 0) {
            System.out.println("stop hacking!");
        } else {
            if ((double) numofkills / numofdeaths >= jwktdratio) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
        sc.close();
    }
}
