import java.lang.StringBuilder;
import java.util.regex.Pattern;

public class App {
    
    static String toCamelCase(String s){
        if(s == null){
            return s;
        }
        else {
            String[] words = s.split("[-_]");
            StringBuilder result = new StringBuilder("");
            for(int i = 0; i < words.length; i++){
                if(i == 0){
                    result.append(words[0]);
                }
                else{
                    String temp = words[i];
                    temp = Character.toUpperCase(temp.charAt(0)) + temp.substring(1).toLowerCase();
                    result.append(temp);
                }
            }
            return result.toString();
        }
      } 
    
    
    
    public static void main(String[] args) throws Exception {
        String s1 = "the-stealth-warrior";
        String s2 = "The_Stealth_Warrior";
        String s3 = "The_Stealth-Warrior";
        System.out.println(toCamelCase(s1));
        System.out.println(toCamelCase(s2));
        System.out.println(toCamelCase(s3));
    }
}
