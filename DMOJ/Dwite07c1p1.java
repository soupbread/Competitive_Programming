import java.util.Scanner;

public class Dwite07c1p1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num<2){
            System.out.println("not");
            System.exit(0);
        }
        if(num==2){
            System.out.println("prime");
            System.exit(0);
        }


        for(int i=2;i<=num;i++){
            if(num%i==0){
                System.out.println("prime");
                System.exit(0);
            }
            else if(i==num){
                System.out.println("not");
                System.exit(0);
            }
        }
        sc.close();
    }
}