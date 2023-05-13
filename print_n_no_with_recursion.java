//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

// import java.io.*;
import java.util.*;
 public class print_n_no_with_recursion {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		    //creating an object of class Print
		    Solution obj=new Solution();
		    int N;
		    
		    //input N
		    N=sc.nextInt();
		    
		    //calling printNos() methdo
		    //of class Print
		    obj.printNos(N);
            sc.close();
		
	}
}


// } Driver Code Ends


//User function Template for Java



class Solution
{
    
  public void printNos(int N)
    {
        //Your code here
        if(N==1){
            System.out.print(1+" ");
            return;
        }
        printNos(N-1);
        System.out.print(N+" ");
    }
}
