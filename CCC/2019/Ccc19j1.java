import java.util.Scanner;

public class Ccc19j1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] bananas = new int[3];
        int[] apples = new int[3];

        for (int i = 0; i < 3; i++) {
            apples[i] = sc.nextInt();
            if(i==0){
                apples[i] = apples[i]*3;
            }
            if(i==1){
                apples[i] = apples[i]*2;
            }
        }

        for (int j = 0; j < 3; j++) {
            bananas[j] = sc.nextInt();
            if(j==0){
                bananas[j] = bananas[j]*3;
            }
            if(j==1){
                bananas[j] = bananas[j]*2;
            }
        }

        int tempa = 0;
        int tempb = 0;

        for(int k = 0; k<3;k++){
            tempa += apples[k];
        }
        for(int o = 0; o<3;o++){
            tempb += bananas[o];
        }
        if(tempa > tempb){
            System.out.println("A");
        }
        if (tempb>tempa){
            System.out.println("B");
        }
        if(tempa == tempb){
            System.out.println("T");
        }
        sc.close();
    }
}