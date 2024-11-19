import java.util.Scanner;
public class Dmopc19c4p0 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String ogstring = sc.nextLine();
        String goalstring = sc.nextLine();

        char[] ogstringa = ogstring.toCharArray();
        char[] goalstringa = goalstring.toCharArray();

        int count = 0;
        for(int i=0;i<ogstringa.length;i++){
            if(ogstringa[i] == goalstringa[i]){
                count +=1;
            }
        }
        if(count==ogstringa.length-1){
            System.out.println("LARRY IS SAVED!");
        }
        else{
            System.out.println("LARRY IS DEAD!");
        }
        sc.close();
    }
}