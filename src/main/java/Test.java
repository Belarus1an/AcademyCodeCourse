public class Test {

    public static void main(String[] args) {

    }

    static String word(String string){

        String word = "";
        for (int i = 0; i < string.length(); i++) {
            word += string.charAt(word.length() - i - 1);
        }


        return word;
    }
}
