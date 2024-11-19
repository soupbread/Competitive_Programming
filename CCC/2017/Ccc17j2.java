import java.util.Scanner;

public class Ccc17j2 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        int sum = num;

        for(int i=0;i<k;i++){
            num = num*10;
            sum += num;
        }
        System.out.println(sum);
        sc.close();
    }
}