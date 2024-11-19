import java.util.Scanner;
public class Ccc13j2 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] allowed = new char[7];
        
        allowed[0] = 'I';
        allowed[1] = 'O';
        allowed[2] = 'S';
        allowed[3] = 'H';
        allowed[4] = 'Z';
        allowed[5] =  'X';
        allowed[6] =  'N';

        int goodcount = 0;

        for(int i=0;i<input.length();i++){
            for(int n=0; n<allowed.length;n++){
                if(input.charAt(i) == allowed[n]){
                    goodcount += 1;
                }
            }
        }
        if(goodcount == input.length()){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}