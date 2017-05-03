package Counting;

public class Counting {
    private static final String VOWELS = "aeiouyAEIOUYаеёиоуыэюяАЕЁИОУЫЭЮЯ";
    private static final String CONSONANTS = "bcdfghjklmnpqrstvwxzBCDFGHJKLMNPQRSTVWXZбвгджзйклмнпрстфхцчшщБВГДЖЗЙКЛМНПРСТФХЦЧШЩ";

    public static boolean isVowel(char ch) {

        return VOWELS.indexOf(ch) >= 0;
    }

    public static boolean isConsonants(char ch) {

        return CONSONANTS.indexOf(ch) >= 0;
    }

    public static int vowel(String line) {

        int counter = 0;
        for(int i = 0; i < line.length(); ++i)
            if(isVowel(line.charAt(i)))
                ++counter;

        return counter;
    }

    public static int consonants(String line) {

        int counter = 0;
        for(int i = 0; i < line.length(); ++i)
            if(isConsonants(line.charAt(i)))
                ++counter;

        return counter;
    }
}