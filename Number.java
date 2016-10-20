import java.util.Scanner;
public class Number{
public static void main(String args[])
{
int n,sum=0;
Scanner scan=new Scanner(System.in);
System.out.println("enter the number");
n=scan.nextInt();
if(n<0)
{
n=n*-1;
}
else if(n==0)
{
n=1;
{
else if(n>0)
{
n=n/10;
sum++;
}
System.out.println("number of digits"+sum);
else
System.out.println("invalid");
}
}
