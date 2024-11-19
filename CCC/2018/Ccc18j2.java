import java.util.Scanner;
 
public class Ccc18j2 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numSpaces = sc.nextInt();
        //DAYS AND PARKING LOTS
        char[] yesterdayp = new char[numSpaces];
        char[] todayp = new char[numSpaces];
 
        //TAKING INPUT - yesterday
        String s = sc.next();
        for (int i=0;i<yesterdayp.length;i++){
            yesterdayp[i] = s.charAt(i);
        }
 
        //TAKING INPUT - today
        s = sc.next();
        for (int o=0;o<todayp.length;o++){
            todayp[o] = s.charAt(o);
        }
 
        //COMPARING BOTH DAYS
        int occupiedamount = 0;
        for (int a=0; a<numSpaces; a++){
            if (yesterdayp[a] == 'C'){
                if (todayp[a] == 'C'){
                    occupiedamount += 1;
                }
            }
        }
        System.out.println(occupiedamount);
        sc.close();
    }
}