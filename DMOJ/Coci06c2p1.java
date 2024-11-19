import java.util.Scanner;

public class Coci06c2p1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int mean = sc.nextInt();

        int num2 = mean*2-num1;
        System.out.println(num2);
        sc.close();
    }
}