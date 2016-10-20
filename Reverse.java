import java.util.Scanner;
public class Reverse{
public static void main(String args[])
{
int n,rev=0;
Scanner scan=new Scanner(System.in);
System.out.println("Enter the number");
n=scan.nextInt();
temp=n;
while(temp!=0)
{
rev=rev*10;
rev=n%10+rev;
n=n/10;
}
System.out.println("Reverse of a number"+rev);
}
}
