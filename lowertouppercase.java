import java.io.*;
import java.util.*; 
class lowertouppercase {
    public static void main(String args[]) throws IOException { 

            Scanner sc =new Scanner(System.in);
            String str = sc.nextLine();
            Solution ob = new Solution();
            System.out.println(ob.to_upper(str));
            sc.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String to_upper(String str) 
    { 
        // code here
        String str1= str.toUpperCase();
        return str1;
    }
} 