import java.util.Scanner;
public class Bpc1j1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cnt=0,num=sc.nextInt();

        for(int i=0;i<=num;i++){
            if(sc.nextLine().equals("face")){
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}