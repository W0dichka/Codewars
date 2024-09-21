import java.util.HashMap;
import java.util.Map;

public class App {

    private static final Map<String, String> morseCodeMap = new HashMap<>();
    static {
        morseCodeMap.put(".-", "A");
        morseCodeMap.put("-...", "B");
        morseCodeMap.put("-..", "D");
        morseCodeMap.put("-.-.", "C");
        morseCodeMap.put(".", "E");
        morseCodeMap.put("..-.", "F");
        morseCodeMap.put("--.", "G");
        morseCodeMap.put("....", "H");
        morseCodeMap.put("..", "I");
        morseCodeMap.put(".---", "J");
        morseCodeMap.put("-.-", "K");
        morseCodeMap.put(".-..", "L");
        morseCodeMap.put("--", "M");
        morseCodeMap.put("-.", "N");
        morseCodeMap.put("---", "O");
        morseCodeMap.put(".--.", "P");
        morseCodeMap.put("--.-", "Q");
        morseCodeMap.put(".-.", "R");
        morseCodeMap.put("...", "S");
        morseCodeMap.put("-", "T");
        morseCodeMap.put("..-", "U");
        morseCodeMap.put("...-", "V");
        morseCodeMap.put(".--", "W");
        morseCodeMap.put("-..-", "X");
        morseCodeMap.put("-.--", "Y");
        morseCodeMap.put("--..", "Z");
        morseCodeMap.put("-----", "0");
        morseCodeMap.put(".----", "1");
        morseCodeMap.put("..---", "2");
        morseCodeMap.put("...--", "3");
        morseCodeMap.put("....-", "4");
        morseCodeMap.put(".....", "5");
        morseCodeMap.put("-....", "6");
        morseCodeMap.put("--...", "7");
        morseCodeMap.put("---..", "8");
        morseCodeMap.put("----.", "9");
    }

    public static String MorseCode(String morseCode) {
        return morseCodeMap.getOrDefault(morseCode, "");
    }



    public static String decode(String morseCode) {
        String[] words = morseCode.split(" ");
        String answer = "";
        for(int i = 0; i < words.length; i++){
            words[i] = MorseCode(words[i]);
            answer += words[i];
            
        }
        answer = answer.replace("nullnull", " ");
        answer = answer.replace("null", "");
        return answer.trim();
    }

    public static void main(String[] args) throws Exception {
        System.out.println(decode(" . ."));
    }
}
