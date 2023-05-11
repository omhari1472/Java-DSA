
import java.util.*;
// import java.lang.*;
import java.io.*;

class last_index_of_one {
	public static void main(String[] args) throws IOException
	{
        Scanner sc=new Scanner(System.in);
        // int t = sc.nextInt();
            String s = sc.next();
            
            Solution obj = new Solution();
            System.out.println(obj.lastIndex( s));
        sc.close(); 
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    public int lastIndex( String s) {
        
        int n=s.length();
        
        for(int i=n-1; i>=0; i--){
            char ch=s.charAt(i);
            if(ch=='1'){
                return i;
            }
        }
        return -1;
    }
}