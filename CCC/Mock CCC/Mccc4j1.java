import java.util.Scanner;

public class Mccc4j1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int m = sc.nextInt();
        int b = sc.nextInt();

        int tf = sc.nextInt();
        int tm = sc.nextInt();
        int tb = sc.nextInt();

        int totalPeople = tf+tm+tb;
        int totalMoney = f*tf+m*tm+b*tb;
        System.out.println(totalPeople+" "+totalMoney);
        sc.close();
    }
}