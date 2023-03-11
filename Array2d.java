import java.util.*;

class Array2d
{
 int[][] arr;
 int m,n,i;
 public void input()
 {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no. of rows in array");
    m=sc.nextInt();
    System.out.println("Enter no. of cols in array");
    n=sc.nextInt();
    arr=new int[m][n];
    System.out.println("Enter elements");
    for(int r=0;r<m;r++)
    {
        for (int i=0;i<n;i++)
        {
            arr[r][i]=sc.nextInt();
        }
    }
 }      

 public void print()
{
    System.out.println("Elements are:-");
    for(int r=0;r<m;r++)
    {
    for(int i=0;i<n;i++)
    {
        System.out.print(arr[r][i]);
    }    
    System.out.println();
}
 }
 public static void main(String args[])
 {
     Array2d arr1=new Array2d();
     arr1.input();
     arr1.print();
 }
} 