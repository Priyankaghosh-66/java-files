import java.util.*;
class MuArrayDemo{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the row of array:");
int row=sc.nextInt();
System.out.println("Enter the col of array:");
int col=sc.nextInt();
int arr1[][]=new int[row][col];
System.out.println("Enter the elements of array:");
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
arr1[i][j]=sc.nextInt();
}
}
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
System.out.print("\t"+arr1[i][j]);
}
System.out.println("\n");
}
}
}
