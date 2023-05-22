//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class equilibirium_point_array {

    public static void main(String[] args) throws IOException {
          
      Scanner sc = new Scanner(System.in);
            
            //taking input n
            int n = sc.nextInt();
            long arr[] = new long[n];
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

         if (n == 1) {
            return 1;
        }

                long totalSum = 0;

                for (int i = 0; i < n; i++) {
             totalSum += arr[i];
             }        long leftSum = 0;

        for (int i = 0; i < n; i++) {
            totalSum -= arr[i];
            if (leftSum == totalSum) {
                return i + 1; // Adding 1 to convert 0-based index to 1-based index
            }
            leftSum += arr[i];
        }

        return -1;
    }
}
