import java.util.Scanner;
public class Dmopc14c5p1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int h = sc.nextInt();
        System.out.println(Math.PI*r*r*h/3);
        sc.close();
    }
}