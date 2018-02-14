import java.io.*;
class DisplayContent{
public static void main(String[] args)
{
File directory=new File("D://MyPrj");
File [] contentsOfDirectory=directory.listFiles();
for(File obj:contentsOfDirectory)
{
if(obj.isFile())
{
System.out.format("File Name:%s%n",obj.getName());
}
else if(obj.isDirectory()){
System.out.format("Directory Name:%s%n",obj.getName());
}
}
}
}