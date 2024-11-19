import java.util.Scanner;

public class Ccc18j1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int digit1 = sc.nextInt();
        int digit2 = sc.nextInt();
        int digit3 = sc.nextInt();
        int digit4 = sc.nextInt();

        if(digit1 != 8 && digit1 != 9){
            System.out.println("answer");
        }
        else if(digit2 != digit3){
            System.out.println("answer");
        }
        else if (digit4 != 8 && digit4 != 9 ){
            System.out.println("answer");
        }
        else{
            System.out.println("ignore");
        }
        sc.close();
    }
}