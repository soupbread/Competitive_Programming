import java.util.Scanner;

public class Ccc01j2 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int m = sc.nextInt();
        boolean possible = false;

        for(int i=1;i<100; i++){
            if(x*i%m == 1){
                possible = true;
                System.out.println(i);
                break;
            }
        }
        if(!possible){
            System.out.println("No such integer exists.");
        }
        sc.close();
    }
}