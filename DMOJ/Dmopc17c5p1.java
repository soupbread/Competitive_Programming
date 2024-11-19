import java.util.*;

public class Dmopc17c5p1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.replace("0", "O");
        s = s.replace("1","l");
        s = s.replace("3","E");
        s = s.replace("4","A");
        s = s.replace("5","S");
        s = s.replace("6","G");
        s = s.replace("8","B");
        s = s.replace("9","g");
        System.out.println(s);
        sc.close();
    }
}