package week1ZadaniaFor;

public class Zadanie16 {

    public static void main(String[] args) {

        String word = "aAaaBssk";
        int count = 0;

        for (int i = 0; i < word.length(); i++) {

            if (Character.isLowerCase(word.charAt(i))){
                count++;
            }
        }

        System.out.println(count);
    }
}
