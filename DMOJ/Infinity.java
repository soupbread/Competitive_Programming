import java.util.Scanner;

public class Infinity {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num1hex = sc.nextLine();
        String num2hex = sc.nextLine();


        int num1 = Integer.parseInt(num1hex, 16);
        int num2 = Integer.parseInt(num2hex, 16);

        if(num1+num2>1061109567){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}