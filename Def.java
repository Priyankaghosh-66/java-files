class Def{
public Def(){
System.out.println("Default constructor of def");
}
public void a_method(){
System.out.println("Inside method default");
}
public static void main(String[] args){
Def ob=new Def();
ob.a_method();
}
}