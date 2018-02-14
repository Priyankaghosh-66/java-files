class staPolDe{
void product(int x,int y)
{
System.out.println("The product of two variables are:"+(x*y));
}
void product(int x,int y,int z)
{
System.out.println("The product of two variables are:"+(x*y*z));
}
public static void main(String[] args)
{
staPolDe st=new staPolDe();
st.product(8,9);
st.product(8,9,10);
}
}