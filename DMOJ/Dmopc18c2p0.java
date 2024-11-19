import java.util.Scanner;

public class Dmopc18c2p0 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[3];
        for(int i = 0; i <3;i++){
            inputs[i] = sc.nextInt();
        }

        int area = inputs[0];
        int ii = inputs[2]/inputs[1];
        if(ii > area){
            System.out.println(area);
        }
        else{
            System.out.println(ii);
        }
        sc.close();
    }
}