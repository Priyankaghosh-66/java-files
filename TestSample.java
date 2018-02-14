class Threaddemo extends Thread{
public void run()
{
for(int i=0;i<3;i++)
{
System.out.println("Inside child thread");
}
}
}


class TestSample{
public static void main(String[] args)
{
Threaddemo ob=new Threaddemo();
ob.start();
for(int j=0;j<2;j++)
{
System.out.println("Inside main thread");
}
}
}
