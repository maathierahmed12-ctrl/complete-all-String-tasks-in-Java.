public class bobThere {
    public static void main(String[] args) {

    }

    public static boolean bobThere(String str) {

            if(str.length() < 2){

                if(str == "x"){

                    return false;

                }

                return true;

            }

            for (int i = 0 ; i < str.length()- 1;i++){

                if (str.charAt(i)=='x' && str.charAt(i + 1) == 'y'){

                    return true;

                }

            }

            return false;
        }


}
