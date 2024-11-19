import java.util.Scanner;
public class Sac22cc4jp1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String guess = sc.nextLine();
        char[] guessr = guess.toCharArray();
        int cnt = 0;

        for(int i=0;i<guessr.length;i++){
            if(guessr[i] == 'a' || guessr[i] == 'e' || guessr[i] == 'i' || guessr[i] == 'o' || guessr[i] == 'u'|| guessr[i] == 'y'){
                cnt+=1;
            }
        }

        if(cnt>=2){
            System.out.println("good");
        }
        else{
            System.out.println("bad");
        }
        sc.close();
    }
}