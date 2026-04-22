public class catDog {
        public static void main(String[] args) {


        }

        public static boolean catDog(String str) {

            int cat = 0;
            int dog = 0;
            int count = 0;

            for (int i = 0; i <= str.length() - 1; i++) {

                if (str.equals("cat")) {
                    count++;
                } else {

                    if (str.equals("dog")) {
                        count++;
                    }
                    return cat == dog;

                }











