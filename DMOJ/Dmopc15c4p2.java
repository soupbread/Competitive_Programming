import java.util.Scanner;
public class Dmopc15c4p2 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hStop = sc.nextInt(), mStop = sc.nextInt(), mPassed = sc.nextInt(), currentMin;
        currentMin = mStop + mPassed;
        
        while(currentMin>=60){
            hStop++;
            currentMin = currentMin-60;
            if(currentMin == 60){
                hStop++;
                currentMin = 0;
            }
            if(hStop>=24){
                hStop = hStop - 24;
            }
        }
        System.out.println(hStop+" "+currentMin);
        sc.close();
    }
}