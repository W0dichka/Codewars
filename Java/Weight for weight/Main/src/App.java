import java.util.Arrays;
import java.util.Comparator;

public class App {

	public static String orderWeight(String strng) {
        if (strng.trim().isEmpty()) {
            return strng;
        }
        
        String[] numbers = strng.split(" ");
        if (numbers.length == 1) {
            return strng;
        }

        String[][] array = new String[numbers.length][2];
        for (int i = 0; i < numbers.length; i++) {
            array[i][0] = numbers[i];  
            int sum = 0;
            for (char c : numbers[i].toCharArray()) {
                sum += c - '0';
            }
            array[i][1] = String.valueOf(sum);
        }

        Arrays.sort(array, new Comparator<String[]>() {
            @Override
            public int compare(String[] a, String[] b) {
                int weightA = Integer.parseInt(a[1]);
                int weightB = Integer.parseInt(b[1]);
                
                if (weightA != weightB) {
                    return Integer.compare(weightA, weightB);
                }
                return a[0].compareTo(b[0]);
            }
        });

        StringBuilder answer = new StringBuilder(array[0][0]);
        for (int i = 1; i < numbers.length; i++) {
            answer.append(" ").append(array[i][0]);
        }
        return answer.toString();
    }

    public static void main(String[] args) throws Exception {  
        System.out.println(orderWeight("103 123 4444 99 2000"));  
        System.out.println(orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
        System.out.println(orderWeight(""));
        System.out.println(orderWeight("59544965313"));
    }
}
