import java.io.*;
class StringTest{
public static void main(String [] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a string:");
String str=br.readLine();
str=str.toLowerCase();
int len=str.length();
char ch;
System.out.println("Output Is:");
System.out.println("====================");
System.out.println("Alphabet \t\t Total");
System.out.println("====================");
int count=0;
for(char chr='a';chr<='z';chr++)
{
count =0;
for(int j=0;j<len;j++)
{
ch=str.charAt(j);
if(ch==chr)
count++;
}
if(count!=0)
{
System.out.println(chr+"\t\t"+count);
}
}
}
}

