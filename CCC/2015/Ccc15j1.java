import java.util.Scanner;

public class Ccc15j1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int date = sc.nextInt();

        if(month<=2){
            if(month==2) {
                if (date < 18) {
                    System.out.println("Before");
                }
                else if(date>18){
                    System.out.println("After");
                }
                else{
                    System.out.println("Special");
                }
            }
            if(month<2){
                System.out.println("Before");
            }
        }
        else{
            System.out.println("After");
        }
        sc.close();
    }
}