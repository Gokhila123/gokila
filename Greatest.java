
import java.util.Scanner;
public class Greatest{
public static void main(String[] args) {
 int count = 0;
 Scanner scan = new Scanner(System.in);
    System.out.println("Enter any sentence or word combination: ");
    String myString = scan.nextLine();
    String result = "";
   
    String[] words = myString.split("\\s+");
    for(int i = 0; i < words.length; i++) {
        for(int j = 0; j < words[i].length(); j++) {
            for(int k = 1; k < words[i].length(); k++) {
                char temp = words[i].charAt(k);
                if(temp == words[i].charAt(k-1)) {
                    count++;
                }

            }

        }
    }
}
}
}
