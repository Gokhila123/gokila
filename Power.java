import java.util.Scanner;
public class Power{
public static void main(String args[])
{
int a,b;
Scanner scan=new Scanner(System.in);
System.out.println("Enter the number");
a=scan.nextInt();
System.out.println("Enter the power");
b=scan.nextInt();
power obj=new power();
obj.pow(a,b);
}
class head
{
void pow(int c,int d)
{
for(int i=0i<d;i++)
{
int n=c*n;
}
System.out.println(n);
}
}
