import java.util.concurrent.atomic.AtomicInteger;

public class test1 {
	public static void main(String args[]){

	AtomicInteger ai=new AtomicInteger(5);
	if(ai.compareAndSet(5,9))
	{
		System.out.println("Updated valur:"+ai);
}
}
}
