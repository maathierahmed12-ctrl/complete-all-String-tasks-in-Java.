public class task16 {
    public static void main(String[] args) {

    }

    public static Boolean Task16(String str, String charAt) {

        for (int i = 1; i < str.length() - 1; i++) {

            if (str.charAt(i) == '*') {
                if (str.charAt(i - 1) != str.charAt(i + 1)) {
                    return false;
                }
            }
        }
        return true;
    }
}


