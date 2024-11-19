import java.util.Scanner;
 
public class Ccc17j4 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int requiredMinutes = sc.nextInt();
        int cycles = requiredMinutes / 720;
        int extraHourDuration = requiredMinutes % 720 / 60;
        int extraMins = requiredMinutes % 60;
        int totalHourDuration = 0, hour = 0, count = 0;
 
        if (cycles > 0) {
            count = cycles * 31;
        }
 
        while (true) {
            if (hour < 10 && totalHourDuration <= requiredMinutes) {
                if (hour == 0 && requiredMinutes >= 34) {
                    count += 1;
                    totalHourDuration += 1;
                }
                for (int increase = -6; increase <= 4; increase++) {
                    int next1 = hour + increase;
                    int next2 = next1 + increase;
 
                    if (next1 >= 6 || next2 >= 10 || next1 < 0 || next2 < 0 || hour == 0 || (hour == extraHourDuration && 10 * next1 + next2 > extraMins)) {
                        ;
                    } else {
                        count += 1;
                    }
                }
            } else if (hour == 10) {
                totalHourDuration += 1;
            } else if (hour == 11) {
                count += 1;
                totalHourDuration += 1;
            }
            hour += 1;
            if (hour > extraHourDuration) {
                break;
            }
        }
        System.out.println(count);
        sc.close();
    }
}