import java.util.*;
class RevStringArr{
public static void main(String[] args)
{
String quote,rev=" ";
Scanner sc=new Scanner(System.in);
System.out.println("Enter a line to be reversed:");
quote=sc.nextLine();
int length=quote.length();
for(int i=length-1;i>=0;i--)
{
rev=rev+quote.charAt(i);
}
System.out.println("The reverse String is:"+rev);
}
}