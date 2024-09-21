public class App {

    public static String rgb(int r, int g, int b) {
        String Hex = "";
        if(r >=255){
            Hex += "FF";
        }else if (r < 0){
            Hex += "00";
        }else{
            Hex += (String)Integer.toHexString(r / 16) + (String)Integer.toHexString(r % 16);
        }
        if(g >=255){
            Hex += "FF";
        }else if (g < 0){
            Hex += "00";
        }else{
            Hex += (String)Integer.toHexString(g / 16) + (String)Integer.toHexString(g % 16);
        }
        if(b >=255){
            Hex += "FF";
        }else if (b < 0){
            Hex += "00";
        }else{
            Hex += (String)Integer.toHexString(b / 16) + (String)Integer.toHexString(b % 16);
        }
        return Hex.toUpperCase();
    }

    public static void main(String[] args) throws Exception {
        System.out.println(rgb(255, 255, 255));
        System.out.println(rgb(255, -255, 300));
        System.out.println(rgb(0, 0, 0));
        System.out.println(rgb(148, 0, 211));
    }
}
