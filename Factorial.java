import java.util.Scanner;
public class Factorial
{
public static void main(String args[])
{
int n,f=1,i;

Scanner sc=new Scanner(System.in);
System.out.println("Enter the Any Number");


n = sc.nextInt();


for(i=1;i<=n;i++)
{
f = f*i;
}
System.out.println("Factorial is " +n+" "+f);

}
}

