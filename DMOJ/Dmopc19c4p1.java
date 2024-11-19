import java.util.Scanner;
public class Dmopc19c4p1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        while (n>0){

            String str = sc.nextLine();
            boolean valid = false;
            int startCount = 0;
            int endCount = 0;
            char[] chars = str.toCharArray();
            if(str.equals("")){
                valid = true;
            }

            for(int i=0;i<chars.length;i++){
                if(chars[i] == '('){
                    startCount+=1;
                }
                if(chars[i] == ')'){
                    endCount+=1;
                }
                if(endCount>startCount){
                    break;
                }
            }
            if(startCount==endCount){
                valid = true;
            }

            if(valid==true){
                System.out.println("YES");
            }
            else if(valid==false){
                System.out.println("NO");
            }

            n-=1;
        }
        sc.close();
    }
}