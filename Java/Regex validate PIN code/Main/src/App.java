public class App {

    public static boolean validatePin(String pin) { // long
        return pin.matches("[0-9][0-9][0-9][0-9]|[0-9][0-9][0-9][0-9][0-9][0-9]");
      }

    public static boolean validatePin1(String pin) { // short
        return pin.matches("^(\\d{4}|\\d{6})$");
      }

    public static void main(String[] args) throws Exception {
        System.out.println(validatePin("1234"));
        System.out.println(validatePin("12345"));
        System.out.println(validatePin("a234"));
        System.out.println(validatePin1("1234"));
        System.out.println(validatePin1("12345"));
        System.out.println(validatePin1("a234"));
    }
}
