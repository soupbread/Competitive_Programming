import java.util.Scanner;

public class Ccc10j2 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int s = sc.nextInt();
        int s2 = s;

        int nikkyStep = 0;
        int byronStep = 0;

        if(s!=0){
            while (s>0){
                if(s>=a){
                    nikkyStep+=a;
                    s -= a;
                    if(s>=b){
                        nikkyStep-=b;
                        s-=b;
                    }
                    else{
                        nikkyStep-=s;
                        s-=s;
                    }
                }
                else{
                    nikkyStep+=s;
                    break;
                }
            }
        }

        if (s2!=0) {
            while (s2 > 0) {
                if (s2 >= c) {
                    byronStep += c;
                    s2 -= c;

                    if (s2 >= d) {
                        byronStep -= d;
                        s2 -= d;
                    } else {
                        byronStep -= s2;
                        s2 -= s2;
                    }
                } else {
                    byronStep += s2;
                    break;
                }
            }
        }
        if(nikkyStep>byronStep){
            System.out.println("Nikky");
        }
        else if(byronStep>nikkyStep){
            System.out.println("Byron");
        }
        else {
            System.out.println("Tied");
        }
        sc.close();
    }
}