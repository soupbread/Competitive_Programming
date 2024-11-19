import java.util.Scanner;

public class Primes1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 9};
        int amount = sc.nextInt();

        for(int i=0;i<amount;i++){
            System.out.println(primes[i]);
        }
        sc.close();
    }
}