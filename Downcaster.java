class Downcaster{
public static void main(String[] args)
{
Animal an=new Animal();
Dog d=new Dog();
//Animal a=new Dog();
System.out.println(d instanceof Animal);
System.out.println(an instanceof Dog);
System.out.println(d instanceof Animal);
}
}