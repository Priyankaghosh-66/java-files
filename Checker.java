import java.io.*;
class Checker{
public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter your String:");
String s=br.readLine();
s=s.toLowerCase();
char ch;
int l=s.length();
System.out.println("Output");

System.out.println("================");
System.out.println("Alphabet \t count");
System.out.println("================");
int count=0;
for(char c='a';c<='z';c++)
{
count=0;
for(int j=0;j<l;j++)
{
ch=s.charAt(j);
if(ch==c)
count++;
}
if(count!=0)
{
System.out.println(c+"\t\t"+count);
}
}
}
}
