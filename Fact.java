import java.util.Scanner;
public class Fact
{
public static void main(String args[])
{
int n,i,fact=1;
Scanner scan=new Scanner(System.in);
System.out.println("Enter the number");
n=scan.nextInt();
for(i=1;i<n;i++)
{
fact=fact*i;
System.out.println("factorial of anumber"+fact);
}
}
}
