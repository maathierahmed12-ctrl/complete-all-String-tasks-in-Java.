import java.util.*;
    public class Task3 {
        public static void main(String[] args) {


        }

        public static String Task3(String str) {

            String count = "";
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                count += count;

                count = str + count;
            }
            return count;
        }

    }

}
