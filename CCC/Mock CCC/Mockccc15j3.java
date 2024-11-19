import java.util.Scanner;
import java.util.Arrays;

public class Mockccc15j3 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] levels = new int[n];
        int different = 0;

        for(int i=0;i<n;i++){
            levels[i] = sc.nextInt();
        }

        Arrays.sort(levels);

        for(int j=0;j<n;j++){
            if (j==0){
                different+=1;
            }
            else{
                if(levels[j] != levels[j-1]){
                    different+=1;
                }
            }
        }
        System.out.println(different);
        sc.close();
    }
}