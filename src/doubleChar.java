public class doubleChar {
    public static void main(String[] args) {


    }

    public static String doubleChar(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            result = ch + result;
        }
        return result;
    }

}

