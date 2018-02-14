import java.io.FileOutputStream;
public class ResourceDemo{
public static void main(String[] args)
{
try(FileOutputStream fileOutputStream=new FileOutputStream("D:\\es.txt")){
String msg="Welcome to javatpoint!";
byte byteArray[]=msg.getBytes();
fileOutputStream.write(byteArray);
System.out.println("Message written to file ");
}catch(Exception e)
{
System.out.println(e);
}
}
}