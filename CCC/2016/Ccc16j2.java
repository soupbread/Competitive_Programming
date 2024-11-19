import java.util.*;
public class Ccc16j2 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0, temp2 = 0;
        boolean magic = true;
        int[][] square = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int g = 0; g < 4; g++) {
                square[i][g] = sc.nextInt();
            }
        }
        //rows
        for (int i = 0; i < 4; i++) {
            temp2 = temp;
            temp = 0;
            for (int g = 0; g < 4; g++) {
                temp += square[i][g];
            }
            if (i >= 1 && temp2 != temp) {
                magic = false;
                break;
            }
        }

        if(magic){
            // column
            for (int i = 0; i < 4; i++) {
                temp=0;
                for (int g = 0; g < 4; g++) {
                    temp+=square[g][i];
                }
                if(temp!=temp2){
                    magic=false;
                    break;
                }
            }
        }
        if(magic){
            System.out.println("magic");
        }
        else{
            System.out.println("not magic");
        }
        sc.close();
    }
}