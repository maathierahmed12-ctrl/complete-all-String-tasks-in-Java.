public class countHi {
        public static void main(String[] args) {


        }

        public static String countHi(String str) {

            String count = "";
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                 count += count;

                count = str + count;
            }
            return count;
        }

    }

