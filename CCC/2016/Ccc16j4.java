import java.io.*;

public class Ccc16j4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String start=br.readLine();
        int mins = (Character.getNumericValue(start.charAt(0))*10 + Character.getNumericValue(start.charAt(1)))*60 + (Character.getNumericValue(start.charAt(3))*10+Character.getNumericValue(start.charAt(4)));
        
        if((mins>=420 && mins<600) || (mins>=900 && mins<1140)){
            if(mins<600) mins+=(600-mins)+(120-(600-mins)/2);
            else mins+=(1140-mins)+(120-(1140-mins)/2);
        }
        else if((mins+120>=420 && mins+120<600) || (mins+120>=900 && mins+120<1140)){
            if(mins+120<600){
                if(120-((420-mins))>90) mins+=(420-mins)+180+((120-((420-mins)))*2-180)/2;
                else mins+=(120-(420-mins))*2+(420-mins);
            }
            else if(mins+120<1140){
                if(120-((900-mins))>90)  mins+=(900-mins)+180+((120-((900)))*2-180)/2;
                else mins+=(120-(900-mins))*2+(900-mins);
            }
            else mins+=(120-(900-mins))*2+(900-mins);
        }
        else mins+=120;
        if(mins/60<10) System.out.print("0"+(mins/60));
        else if(mins/60>=24){
            if(mins/60-24<10) System.out.print("0"+(mins/60-24));
            else System.out.print(mins/60-24);
        }
        else System.out.print(mins/60);
        System.out.print(":");
        if((mins%60)<10) System.out.print("0"+(mins%60));
        else System.out.print(mins%60);
    }
}