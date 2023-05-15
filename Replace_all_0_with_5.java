//{ Driver Code Starts
import java.util.Scanner;
import java.lang.Math;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            System.out.println(new GfG().convertfive(N))
        }
    }
}
// } Driver Code Ends


class Replace_all_0_with_5 {
    int convertfive(int num) {
        // Your code here
        int decimalPlace=1;
        int result=0;
        if(num==0){
            return 5;
        }
        else {
            while(num>0){
                if (num%10==0){
                   result = result +(5*decimalPlace);
                }
                result= result +(num%10)*decimalPlace;
                decimalPlace*=10;
                num/=10;
             }
            }
        return result;
    }
}
