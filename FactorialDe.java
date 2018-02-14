import java.util.*;
class FactorialDe{
public static void main(String[] args)
{
int fact=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number to determine its factorial:");
int n=sc.nextInt();
if(n<0)
{
System.out.println("Your entered value is negative:");
}
else
{
for(int c=1;c<=n;c++)
{
fact=fact*c;
}
System.out.println("The factorial of " +n+ "is = "+fact);
}
}
}