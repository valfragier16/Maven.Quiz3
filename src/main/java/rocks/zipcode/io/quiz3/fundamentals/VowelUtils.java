package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        for(Character c: word.toCharArray()){
            if(isVowel(c)){
                return true;
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        for(int i = 0; i < word.length(); i++){
            if(isVowel(word.charAt(i))){
                return i; // returns index of First vowel
            }
        }
        return -1; // returns if vowel is not in word
    }


    public static Boolean startsWithVowel(String word) {
//        if ((word.charAt(0)=='a')||(word.charAt(0)=='e')||(word.charAt(0)=='i')||(word.charAt(0)=='o')||(word.charAt(0)=='u')) {
//            return true;
//        }
//        else if((word.charAt(0)=='A')||(word.charAt(0)=='E')||(word.charAt(0)=='I')||(word.charAt(0)=='O')||(word.charAt(0)=='U')){
//            return true;
//        }
//        return false;

        return isVowel(word.charAt(0));
    }

    public static Boolean isVowel(Character character) {
        if(character == 'a'|| character == 'e'|| character == 'i' || character == 'o' || character == 'u'|| character == ' '){
            return true;
        }
        else return character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U' || character == ' ';
    }
}
