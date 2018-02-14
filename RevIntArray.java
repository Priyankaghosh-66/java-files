import java.util.*;
class RevIntArray{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter the size of array:");
n=sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter the elements :");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("Before reversing array elements:");
for(int i=0;i<n;i++)
{
System.out.print(" "+arr[i]);
}
System.out.println();
System.out.println("Array after reversing:");
for(int i=n-1;i>=0;i--)
{
System.out.print(" "+arr[i]);
}
}
}