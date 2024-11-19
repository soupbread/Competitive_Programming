import java.util.Scanner;

public class Dmopc19c5p0 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numofpar = sc.nextInt();
        int cutoff = sc.nextInt();

        for(int i=0;i<numofpar;i++){
            String participant = sc.next();
            int score = sc.nextInt();

            if(score<=cutoff){
                System.out.println(participant+" will not advance");
            }
            else{
                System.out.println(participant+" will advance");
            }
        }
        sc.close();
    }
}