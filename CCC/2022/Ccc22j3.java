import java.io.*;

public class Ccc22j3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        for(int i=0;i<input.length();i++){
            if(Character.isLetter(input.charAt(i))){
                System.out.print(input.charAt(i));
            }
            if(Character.isDigit(input.charAt(i))){
                System.out.print(input.charAt(i));
                if(i!=input.length()-1 && !Character.isDigit(input.charAt(i+1))){
                    System.out.print("\n");
                }
            }
            if(input.charAt(i)=='+'){
                System.out.print(" tighten ");
            }
            if(input.charAt(i)=='-'){
                System.out.print(" loosen ");
            }
        }
    }
}