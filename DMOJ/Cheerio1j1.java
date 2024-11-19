import java.util.*;

public class Cheerio1j1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] word = sc.nextLine().toCharArray();
        int readableCnt = 0;

        for(int i=1;i<word.length;i++){
            if((word[i]=='a' || word[i]=='e' || word[i]=='i' || word[i]=='o' || word[i]=='u') && (word[i-1]!='a' && word[i-1]!='e' && word[i-1]!='i' && word[i-1]!='o' && word[i-1]!='u')){
                readableCnt++;
            }
            else if((word[i]!='a' && word[i]!='e' && word[i]!='i' && word[i]!='o' && word[i]!='u') && (word[i-1]=='a' || word[i-1]=='e' || word[i-1]=='i' || word[i-1]=='o' || word[i-1]=='u')){
                readableCnt++;
            }
        }
        if(readableCnt==word.length-1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
