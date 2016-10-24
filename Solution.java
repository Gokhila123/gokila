public class Solution {

public int romanToInt(String s) {
    if(s == null){
        return 0;
    }
    
    int length = s.length();
    int a = 0;
    int b = 0;
    
    for(int i = length - 1; i >= 0; i--){
        int cur = romanTable(s.charAt(i));
        
        if(i == length - 1){
            a = a + cur;
        }else{
           if(cur < pre){
               a = a - cur;
           }else{
               a= a + cur;
           }
        }
        b = cur;
    }
    
    return a;
}

public int romanTable(char c){
    int num = 0;
    switch(c){
        case 'I':
            num = 1;
            break;
        case 'V':
            num = 5;
            break;
         case 'X':
            num = 10;
            break;
         case 'L':
             num = 50;
             break;
         case 'C':
             num = 100;
             break;
         case 'D':
             num = 500;
             break;
         case 'M':
             num = 1000;
             break;
         default:
             num = 0;
             break;
    }
    return num;
}
