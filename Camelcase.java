static String toCamelCase(String s){
           String[] parts = s.split(" ");
           String camelCaseString = "";
           for (String part : parts){
               if(part!=null && part.trim().length()>0)
              camelCaseString = camelCaseString + toProperCase(part);
               else
                   camelCaseString=camelCaseString+part+" ";   
           }
           return camelCaseString;
        }

        static String toProperCase(String s) {
            String tem=s.trim();
            String spaces="";
            if(tem.length()!=s.length())
            {
            int startCharIndex=s.charAt(tem.indexOf(0));
            spaces=s.substring(0,startCharIndex);
            }
            tem=tem.substring(0, 1).toUpperCase() +
            spaces+tem.substring(1).toLowerCase()+" ";
            return tem;

        }
        public class CamelCase{
  public static void main(String[] args) {
     String string="india is my country";
     System.out.println(toCamelCase(string));
  }
  }
