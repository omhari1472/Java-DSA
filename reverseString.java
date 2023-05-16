//{ Driver Code Starts
// Initial template for Java

import java.util.*;
import java.io.*;
class reverseString {
    public static void main(String args[]) throws IOException {

             Scanner sc=new Scanner(System.in);
            String S = sc.nextLine();
            Solution ob = new Solution();

            System.out.println(ob.revStr(S));
        }
    }
}
// } Driver Code Ends


class Solution {
    static String revStr(String S) {
        // code here

        int n = S.length();
        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            char ch = S.charAt(i);
            sb.append(ch);
        }
        return sb.toString();
    }
}
