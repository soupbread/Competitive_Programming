import java.util.*;
public class Ccc14j2 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        int a = 0, b=0;
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        String s = sc.next();
        
        for (int i=0; i<s.length();i++){
            char vote = s.charAt(i);
            if (vote == 'A'){
                a += 1;
            }
            if (vote == 'B'){
                b += 1;
            }
        }
        if (a>b){
            System.out.println("A");
        }
        if (b>a){
            System.out.println("B");
        }
        if (a==b){
            System.out.println("Tie");
        }
        sc.close();
    }
}