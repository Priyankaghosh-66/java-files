import java.util.*;
class Rectangle{
public static void main(String[] args)
{
int area,hei,wid;
Scanner sc=new Scanner(System.in);
System.out.println("enter the height-");
hei=sc.nextInt();
System.out.println("enter the width-");
wid=sc.nextInt();
area=hei*wid;
System.out.println("The area of rectangle having height:"+ hei + "& width:" + wid + "=" +area);
}
}