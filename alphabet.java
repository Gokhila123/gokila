import java.util.Scanner;

class Alphabet
{
    public static void main(String args[])
    {
        char letter;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter a Character : ");
        letter = scan.next().charAt(0);
		
        if((letter>='a' && letter<='z') || (letter>='A' && letter<='Z'))
        {
            System.out.print(ch + " is an Alphabet");
        }
        else
        {
            System.out.print(ch + " is not an Alphabet");
        }
    }
}
