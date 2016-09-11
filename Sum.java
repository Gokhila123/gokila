import java.util.Scanner;
class Sum{
public static void main(String [] args)
{
int i=1,x,sum=0;
Scanner scan=new Scanner(System.in);
x=scan.nextInt();
while(i<=x)
sum=sum+i;
i++;
System.out.println("sum of natural numbers"+sum);
}
}
