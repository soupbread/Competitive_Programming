import java.util.Scanner;

public class Coci16c1p1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int max = sc.nextInt();
        int months = sc.nextInt();
        int totalAllowed = months*max;

        for(int n=0;n<months;n++){
            int megabytesUsed = sc.nextInt();
            totalAllowed = totalAllowed - megabytesUsed;
        }
        System.out.println(totalAllowed+max);
        sc.close();
    }
}