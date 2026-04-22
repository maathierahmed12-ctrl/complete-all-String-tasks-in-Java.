public class starOut {


    public static String[] starOut(String str, String charAt) {

        String result = "";
        for (int i = 1; i < str.length() - 1; i++) {

            if (str.charAt(i) == '*') {
                if (str.charAt(i - 1) != str.charAt(i + 1)) {
                }

                return result;
            }
        }
    }
}


