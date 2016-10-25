import java.util.*;
import java.util.Scanner;
public class Repeat
{
public  static void printRepeating(int num[])
    {
        int min = -1;
        HashSet<Integer> set = new HashSet<>();
 	      for (int i=num.length-1; i>=0; i--)
        {
           if (set.contains(num[i]))
		    {
           min = i;
		    }
        else  
		    {	 	
            set.add(num[i]);
        }
	 }

        if (min != -1)
        {
          System.out.println("The first repeating element is " + num[min]);
	      }
        else
	      {
          System.out.println("There are no repeating elements");
    	  }

    
    public static void main (String[] args) throws java.lang.Exception
    {
        int num[] = {10, 5, 3, 4, 3, 5, 6};
        printRepeating(num);
    }
}
