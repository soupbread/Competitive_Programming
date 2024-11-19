import java.util.Scanner;
public class Dmopc20c1p1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int  length = sc.nextInt();
        sc.nextLine();
 
        for(int i=0;i<length;i++){
            String input = sc.nextLine().toUpperCase();
            if(!input.contains("M") && !input.contains("C")){
                System.out.println("PASS");
            }
            else if(input.contains("M") && input.contains("C")){
                System.out.println("NEGATIVE MARKS");
            }
            else if(input.contains("M") || input.contains("C")){
                System.out.println("FAIL");
        }
        sc.close();
        }
    }
}