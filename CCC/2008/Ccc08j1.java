import java.io.*;

public class Ccc08j1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException{
        double bmi = Double.parseDouble(br.readLine())/Math.pow(Double.parseDouble(br.readLine()),2);
        
        if(bmi>25) System.out.println("Overweight");
        else if(bmi<18.5) System.out.println("Underweight");
        else System.out.println("Normal weight");
    }
}