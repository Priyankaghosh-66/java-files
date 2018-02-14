class HardwareBook extends Book{
String hardwareCategory;
String publisher;
public void getDetails()
{
super.getDetails("Mark Franklin", "All about PC",120,150,80);
hardwareCategory="Machine";
publisher="Denmark";

}
public void showDetails()
{
System.out.println(" ");
super.showDetails();
System.out.println("Publisher Name: "+publisher);
System.out.println(" ");
}
}
