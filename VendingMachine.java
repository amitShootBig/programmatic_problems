package hackerearth;

/* IMPORTANT: Multiple classes and nested static classes are supported */


// uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


//Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class VendingMachine{
   public static void main(String args[] ) throws Exception {
       /* Sample code to perform I/O:
        * Use either of these methods for input

       //BufferedReader
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String name = br.readLine();                // Reading input from STDIN
       System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
*/
 String names[] = new String[]{"Sheldon","Leonard","Penny","Rajesh","Howard"};
       //Scanner
       Scanner s = new Scanner(System.in);
       int index = s.nextInt();                // Reading input from STDIN
       //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
       int sum=0;
       int i=0;
       
       for(;index>sum;i++){
           sum+=5*pow(2,i);
       }
       int groupIndex = pow(2,i-1);
     
      sum = sum-5*groupIndex;
      int startIndex=sum+1;
      int diff = index-startIndex;
      int ans = diff/groupIndex;
      System.out.println(names[ans]);
   }
   
   static int pow(int x,int n){
       int base=x;
       int exponent=n;
       int result = 1;

       while (exponent != 0)
       {
           result *= base;
           --exponent;
       }
       
       return result;
   }
   
}
