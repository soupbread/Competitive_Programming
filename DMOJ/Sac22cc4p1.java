import java.util.Scanner;

public class Sac22cc4p1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n-3<0){
            System.out.println(0);
        }
        else{
            System.out.println(n-3);
        }
        sc.close();
    }
}