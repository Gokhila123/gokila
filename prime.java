import java.util.Scanner;
public class Prime{
public static void main(String args[])
{
int n,temp,i;
boolean prime=true;
System.out.pritln("Enter the number");
Scanner scan=new Scanner(System.in);
n=scan.nextInt();
for(i=2;i<=n/2;i++)
{
temp=n%i;
if(temp==0)
{
prime=false;
break;
}
}
if(prime)
{
System.out.pritln("it is a prime number");
else
System.out.pritln("it is  not a prime number");
}
}
}
