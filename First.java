class Data {
static
{
System.out.println("The Static Block ");
}

Data d1 = new Data();
{
System.out.println("The Non Static Block ");
}
}

class First
{
public static void main(String args[])
{

System.out.println("The Load First Line Code ");

System.out.println("The Load Second Line Code ");
}
}