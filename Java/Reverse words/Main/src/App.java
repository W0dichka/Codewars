public class App {

    public static String reverseWords(final String original){
        if (original.trim().isEmpty()) {
            return original; 
        }
        String[] words = original.split(" ");
        String answer = "";
        for(int i = 0; i < words.length; i++){
            if(words[i] != " "){
                String reversed = new StringBuilder(words[i]).reverse().toString();
                answer += reversed + " ";
            }
        }
      return answer.trim();
    }

    public static void main(String[] args) throws Exception {
        //System.out.println(reverseWords("apple"));
        //System.out.println(reverseWords("double  spaces"));
        System.out.println(reverseWords("The quick brown fox jumps over the lazy dog."));
    }
}
