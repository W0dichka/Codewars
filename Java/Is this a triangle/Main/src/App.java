public class App {

    public static boolean isTriangle(int a, int b, int c){
        return (a + b > c && a + c > b && b + c > a && a > 0 && b > 0 && c > 0);
      }

    public static void main(String[] args) throws Exception {
        System.out.println(isTriangle(1,2,2));
        System.out.println(isTriangle(4,2,3));
        System.out.println(isTriangle(2,2,2));
        System.out.println(isTriangle(1,2,3));
        System.out.println(isTriangle(-5,1,3));
        System.out.println(isTriangle(0,2,3));
        System.out.println(isTriangle(1,2,9));
    }
}
