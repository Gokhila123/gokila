import java.util.Scanner;
public class PrimeRange
{
public static void main(String args[])
{
int i,j;
Scanner scan=new Scanner(System.in);
System.out.println("enter the number");
int n=scan.nextInt();
for(i=1;i<n;i++)
{
boolean p=true;
}
for(j=2;j<i;j++)
{
if(i%j==0)
{
boolean p=false;
}
}
if(p){
System.out.println(i+"");
}
}
}
