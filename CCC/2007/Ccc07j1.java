import java.util.Arrays;
import java.util.Scanner;
public class Ccc07j1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] bowls = new int[3];

        for(int i=0;i<3;i++){
            bowls[i] = sc.nextInt();
        }

        Arrays.sort(bowls);
        System.out.println(bowls[1]);
        sc.close();
    }
}
