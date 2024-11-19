import java.util.Scanner;

public class Aac1p1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] ah =  new int[2];
        for(int i=0; i<2; i++){
            ah[i] = sc.nextInt();
        }

        int sidelength = ah[0];
        int radius = ah[1];

        double  circlearea = radius*radius*3.14;
        double squarearea = sidelength*sidelength;

        if(circlearea > squarearea){
            System.out.println("CIRCLE");
        }
        if(squarearea>circlearea){
            System.out.println("SQUARE");
        }
        sc.close();
    }
}