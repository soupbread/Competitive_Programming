import java.util.*;

public class Bf1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        // create int array of size n
        int[] listOfNumbers = new int[s];
        // read input into array
        for (int i = 0; i < s; i++) {
            listOfNumbers[i] = sc.nextInt();
        }
        // sort it
        Arrays.sort(listOfNumbers);
        // print all the numbers
        for (int i = 0; i < s; i++) {
            System.out.println(listOfNumbers[i]);
        }
        sc.close();
    }
}