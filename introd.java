package/**
 * The class "intro" initializes an array of integers and prints the value of the second
 * element.
 */
 array;

public class introd{
    public static void marks(int a[]){
        for (int i=0; i<a.length; i++)
        {
            a[i]=a[i]+1;
        }

    }
    public static void main(String[] args) {
        int a[]=new int[20];
        a[1]=10;
        a[2]=20;
        a[3]=30;
        marks(a); 
        System.out.println(a[1]);
    }
}