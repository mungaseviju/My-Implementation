class Hello{
static
{
System.out.println("this is static block 3");
}
static
{
System.out.println("this is static block 1");
}
static
{
System.out.println("this is static block 2");
}

{
System.out.println("this is non-static block 1");
}

{
System.out.println("this is non-static block 2");
}
{
System.out.println("this is non-static block 3");
}

public static void main(String args[])
{
System.out.println("this is main @first line");

//First f1=new First();
//First f2=new First();
//First f3=new First();

System.out.println("this is main @last line");

}

}