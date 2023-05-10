
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
            
            Scanner sc =new Scanner(System.in);
            String S = sc.nextLine();
            Solution ob = new Solution();
            String result = ob.firstAlphabet(S);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String firstAlphabet(String S) {
        // code here
        StringBuilder sb =new StringBuilder("");
        int n=S.length();
        char ch;
        sb.append(S.charAt(0));
        for (int i=0; i<n; i++){
            ch=S.charAt(i);
            if(ch==' '){
                sb.append(S.charAt(i+1));
            }
        }
        return sb.toString();
    }
}
