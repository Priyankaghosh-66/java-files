class CastProb{
public static void main(String[] args)
{
Child c=new Child();
Parent p=new Parent();
p.type();
c.type();
c=(Child)p;
p.type();
}
}