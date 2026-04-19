    import java.util.*;
    public class Task2 {
        public static void main(String[] args) {


        }

        public static String Task2(String str) {

            String count = "";
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                 count += count;

                count = str + count;
            }
            return count;
        }

    }

