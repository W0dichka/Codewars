public class App {

    public static int enough(int cap, int on, int wait){
        if( wait - (cap - on) <= 0){
            return 0;
        }
        else{
            return wait - (cap - on);
        }
      }


    public static void main(String[] args) throws Exception {
        System.out.println(enough(10,5,5));
        System.out.println(enough(100, 60, 50));
        System.out.println(enough(20, 5, 5));
    }
}
