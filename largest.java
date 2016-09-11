import java.util.Scanner;
class Largest
{
public static void main(String [] args){
int a,b,c,large;
System.out.println("enter the three numbers");
Scanner scan=new Scanner(System.in);
a=scan.nextInt();
b=scan.nextInt();
c=scan.nextInt();
if((a>b)&&(a>c))
System.out.println("a is larger");
else if((b>c)&&(b>a))
System.out.println("b is larger");
else
System.out.println("c is larger");

}
}
