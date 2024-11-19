import java.util.Scanner;
public class Additionproblems{
    @SuppressWarnings("ConvertToTryWithResources")
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();

		for (int loopcount = 0; loopcount < amount; loopcount++){
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println(num1+num2);
		}
		sc.close();
	}
}