class ObjectCounter
{
 public static int counter;
 public ObjectCounter()
 {
  counter++;
 }
}

 class Testcounter
 {
  public static void main(String [] args)
  {
   ObjectCounter obj=new ObjectCounter();
   System.out.println("Total Numer of objects:"+ObjectCounter.counter);
   ObjectCounter obj1=new ObjectCounter();
   ObjectCounter obj2=new ObjectCounter();
   System.out.println("Total Number of objects:"+ObjectCounter.counter);
  }
 }