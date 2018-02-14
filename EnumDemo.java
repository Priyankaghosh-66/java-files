class EnumDemo{
public enum Numbers { Winters, Spring, Autumn, Summer }


public static void main(String[] a){
for(Numbers i:Numbers.values())

System.out.println(i);

}
}