import java.util.Scanner;

public class Mald1p2 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long exams = sc.nextLong();
        
        for(int i=0;i<exams;i++){
            long score = sc.nextLong();
            long total = sc.nextLong();
            long percent = (score*100+total-1)/total;
            if(percent>100){
                System.out.println("sus");
            }
            else if(percent==100){
                System.out.println("average");
            }
            else if(percent>=98){
                System.out.println("below average");
            }
            else if(percent>=95){
                System.out.println("can't eat dinner");
            }
            else if(percent>=90){
                System.out.println("don't come home");
            }
            else {
                System.out.println("find a new home");
            }
        }
        sc.close();
    }
}