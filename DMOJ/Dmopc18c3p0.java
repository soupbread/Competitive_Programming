import java.util.*;

public class Dmopc18c3p0 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] color1 = new double[3];
        double[] color2 = new double[3];
        int samecount = 0;

        for(int j = 0;j<3; j++){
            color1[j] = sc.nextDouble();
        }
        for(int n = 0;n<3; n++){
            color2[n] = sc.nextDouble();
        }


        for (int i = 0; i < 3; i++) {
            color1[i] = Math.floor(Math.sqrt(color1[i]));
            color2[i] = Math.floor(Math.sqrt(color2[i]));
        }

        for(int l = 0;l<3;l++){
            if (color1[l] == color2[l]){
                    samecount += 1;
            }
        }
        if(samecount == 3){
            System.out.println("Dull");
        }
        else{
            System.out.println("Colourful");
        }
        sc.close();
    }
}