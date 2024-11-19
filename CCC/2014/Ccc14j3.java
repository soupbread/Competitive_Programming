import java.util.*;

public class Ccc14j3 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rounds = sc.nextInt(), a=100, ar, d=100, dr;

        for(int i=0;i<rounds;i++){
            ar=sc.nextInt();
            dr=sc.nextInt();
            if(ar>dr){
                d-=ar;
            }
            else if(dr>ar){
                a-=dr;
            }
        }
        System.out.println(a);
        System.out.println(d);
        sc.close();
    }
}