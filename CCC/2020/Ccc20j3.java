import java.util.*;

public class Ccc20j3 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\D");
        int n=sc.nextInt(), x1=sc.nextInt(), y1=sc.nextInt(), x2=x1, y2=y1, temp;
        
        for(int i=0;i<n-1;i++){
            temp=sc.nextInt();
            if(temp<x1){
                x1=temp;
            }
            if(temp>x2){
                x2=temp;
            }
            temp=sc.nextInt();
            if(temp<y1){
                y1=temp;
            }
            if(temp>y2){
                y2=temp;
            }
        }
        x1-=1;
        y1-=1;
        x2+=1;
        y2+=1;
        System.out.println(x1+","+y1);
        System.out.println(x2+","+y2);
        sc.close();
    }
}