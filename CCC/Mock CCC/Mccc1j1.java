import java.util.Arrays;
import java.util.Scanner;

public class Mccc1j1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[4];
        for (int i=0;i<4;i++){
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        System.out.println(nums[0]);
        System.out.println(nums[3]);
        sc.close();
    }
}
