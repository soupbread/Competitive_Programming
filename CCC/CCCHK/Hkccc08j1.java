// import java.io.*;
// import java.util.*;

// public class Hkccc08j1 {
//     static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     static StringTokenizer in;

//     public static void main(String[] args) throws IOException {
//         int natalie=0, casper=0, temp, cNum=readInt();

//         for(int i=0;i<cNum;i++){
//             temp=casper;
//             casper=readInt()*readInt();
//             if(temp>casper){
//                 casper=temp;
//             }
//         }

//         int nNum=readInt();

//         for(int i=0;i<nNum;i++){
//             temp=natalie;
//             natalie=readInt()*readInt();
//             if(temp>natalie){
//                 natalie=temp;
//             }
//         }

//         if(casper>natalie) System.out.println("Casper");
//         else if(natalie>casper) System.out.println("Natalie");
//         else System.out.println("Tie");
//     }

//     static String next() throws IOException {
//         while (in == null || !in.hasMoreTokens())
//             in = new StringTokenizer(br.readLine());
//         return in.nextToken();
//     }
//     static int readInt() throws IOException {
//         return Integer.parseInt(next());
//     }
// }