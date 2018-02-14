class Sum{
int add(int a,int b){
return a+b;
}
int add(int a,int b,int c){
return a+b+c;
}
int add(int a,int b,int c,int d){
return a+b+c+d;
}

public static void main(String[] args){
Sum ob=new Sum();
System.out.println(ob.add(8,9));
System.out.println(ob.add(3,9,5));
System.out.println(ob.add(1,2,3,4));
}
}