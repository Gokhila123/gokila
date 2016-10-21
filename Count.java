import java.uti.Scanner;
public class Count{
public static void main(String args[])
{
int n,count=0,i,j;
Scanner scan=new Scanner(System.in);
System.out.println("Enter the limit to calculate");
n=scan.nextInt();
for(i=2;i<n;i++)
{
boolean prime=true;
for(j=1;j<i;j++)
{
if(i%j==0)
{
boolean prime=false;
break;
}
}
if(prime)
{
count++;
System.out.println(i+",");
}
}
System.out.println("count"+count);
}
}
