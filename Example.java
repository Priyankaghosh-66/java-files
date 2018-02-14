class Example{
private int var;
Example(){
var=10;
}
Example(int num){
var=num;
}
public int getValue(){
return var;
}
public static void main(String[] args){
Example ex1=new Example(56);
System.out.println(ex1.getValue());
}
}