import java.util.Scanner;

public class Ccc16j1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int wins = 0;
        char[] inputs = new char[6];

        for (int i = 0; i < 6; i++) {
            inputs[i] = sc.next().charAt(0);
            if (inputs[i] == 'W') {
                wins += 1;
            }
        }

        if(wins == 0){
            System.out.println("-1");
        }
        if(wins == 1 || wins == 2){
            System.out.println("3");
        }
        if(wins == 3 || wins == 4){
            System.out.println("2");
        }
        if (wins == 5 || wins == 6){
            System.out.println("1");
        }
        sc.close();
    }
}