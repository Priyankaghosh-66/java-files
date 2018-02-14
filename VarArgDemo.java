class VarArgDemo{
static void display(String...values){
System.out.println("Display invoked");
}
public static void main(String[] args)
{
display();
display("my","name","is");
}
}