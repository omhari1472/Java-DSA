//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
// import java.lang.*;
import java.io.*;

class largest_element_in_an_array {
    public static void main(String[] args) throws IOException
	{
	        Scanner sc = new Scanner(System.in);
            System.out.println("Enter n");
            int n = sc.nextInt();
            int a[] = new int[n];
            System.out.println("Enter no");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            Compute obj = new Compute();
            System.out.println(obj.largest(a, n));
            
        }
}

// } Driver Code Ends


//User function Template for Java

class Compute {
    
    public int largest(int arr[], int n)
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(largest<arr[i])
            largest=arr[i];
        }
        return largest;
    }

}