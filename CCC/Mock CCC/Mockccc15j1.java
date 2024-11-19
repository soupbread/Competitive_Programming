import java.util.Scanner;
public class Mockccc15j1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] phonenumber = sc.nextLine().toCharArray();
        boolean space = false, firstthree = false, length = false, valuable = false;
        String areacode = String.valueOf(phonenumber[0]) + phonenumber[1] + phonenumber[2];

        if(phonenumber.length == 11){
            length = true;
        }
        if(phonenumber[3] == ' '){
            space = true;
        }
        if(areacode.equals("416") || areacode.equals("647") || areacode.equals("437")){
            firstthree = true;
            if(areacode.equals("416")){
                valuable = true;
            }
        }

        if(length && space && firstthree){
            if(!valuable){
                System.out.println("valueless");
            }
            else{
                System.out.println("valuable");
            }

        }
        else{
            System.out.println("invalid");
        }
        sc.close();
    }
}