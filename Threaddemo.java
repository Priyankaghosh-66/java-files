class ThreadObj extends Thread{
public void run()
{
for(int i=0;i<2;i++)
{
System.out.println("Child thread");
}
}
}
class Threaddemo{
public static void main(String[] args)
{
ThreadObj ob1=new ThreadObj();
ob1.start();
for(int i=0;i<1;i++)
{
System.out.println("main thread");
}
}
}


