import java.io.*;
class StringChecker{
public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a string");
String s=br.readLine();
s=s.toLowerCase();
int l=s.length();
char ch;
System.out.println("OutPut");
System.out.println("=============================");
System.out.println("Alphabet \t\t count");
System.out.println("=============================");
int count=0;
for(char c='a';c<='z';c++)
{
count=0;
for( int j=0;j<l;j++)
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




