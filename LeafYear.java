import java.util.Scanner;
public class LeafYear
{
public static void main(String args[])
{
int year;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Year");

year = sc.nextInt();

if(year%4 == 0)
{
System.out.println("Leaf Year");
}
else
{
System.out.println(" Not Leaf Year");
}
}
}
