import java.util.Scanner;
public class Palindrome
{
public static void main(String args[])
{
int rem,rev,sum=0,n,temp;
System.out.pritln("Enter the number");
Scanner scan=new Scanner(System.in);
n=scan.nextInt();
temp=n;
while(num>0)
{
rem=temp%10;
sum=sum*10+rem;
temp=temp/10;
}
if(sum==n)
{
System.out.pritln("the number is palindrome");
else
System.out.pritln("the number is not palindrome");
}
}
}
