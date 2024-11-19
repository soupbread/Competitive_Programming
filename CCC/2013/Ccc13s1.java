import java.util.*;

public class Ccc13s1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year=sc.nextInt(), temp, realyear=year, cnt;
        boolean repeat=true;
        ArrayList<Integer> digits = new ArrayList<>();

        while(repeat){
            realyear++; year=realyear; cnt=0; digits.clear();

            while (year > 0) {
                temp = year % 10;
                digits.add(temp);
                year = year / 10;
            }

            Collections.sort(digits);

            for (int i = 1; i < digits.size(); i++) {
                if (Objects.equals(digits.get(i), digits.get(i - 1))) cnt++;
            }

            if(cnt==0){
                repeat=false;
                System.out.println(realyear);
            }
        }
        sc.close();
    }
}