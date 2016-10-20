import java.util.Scanner;
public class Even{
public static void main(String args[])
{
int num,i;
Scanner scan=new Scanner(System.in);
System.out.pritln("Enter the number");
num=scan.nextInt();
for(i=1;i<num;i++)
{
if(i%2==0)
{
System.out.println("even numbers"+i);
}
}
}
