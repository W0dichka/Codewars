import java.util.Arrays;

public class App {

    public static int findIt(int[] a) {
        Arrays.sort(a);
        int lastElement = a[0];
        int count = 1;
        for(int i = 1; i < a.length; i++){
            if(a[i] == lastElement){
                count++;
            }
            else{
                if(count % 2 == 1){
                    return lastElement;
                }
                else{
                    count = 1;
                    lastElement = a[i];
                }
            }
        }
        if (count % 2 == 1) {
            return lastElement;
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(findIt(new int[] {7}));
        System.out.println(findIt(new int[] {0}));
        System.out.println(findIt(new int[] {1,1,2}));
        System.out.println(findIt(new int[] {0,1,0,1,0}));
        System.out.println(findIt(new int[] {1,2,2,3,3,3,4,3,3,3,2,2,1}));

    }
}
