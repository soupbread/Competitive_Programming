import java.util.*;
public class Ccc20j2 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt(), num = sc.nextInt(), rate = sc.nextInt(), day=0, active=num;

        while(num<=max){
            day++;
            active = active*rate;
            num+=active;
        }
        System.out.println(day);
        sc.close();
    }
}