class Pcd{
Pcd(){
System.out.println("Inside Default constructor!");
}
Pcd(int a,int b){
System.out.println("Inside Parameterized constructor!");
}
public static void main(String[] args){
Pcd ob=new Pcd();


Pcd ob1=new Pcd(12,13);
}
}