package rocks.zipcode.io.quiz3.fundamentals;

import java.util.*;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {

    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        char[] arr = str.toCharArray();
        arr[indexToCapitalize] = Character.toUpperCase(arr[indexToCapitalize]);
        str = new String(arr);
        return str;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        Character c = baseString.charAt(indexOfString);
        if (c.equals(characterToCheckFor)) {
            return true;
        }
        return false;
    }

    public static String[] getAllSubStrings(String string) {
        return null;
    }


    public static Integer getNumberOfSubStrings(String input){
        int n = input.length();
        return (n * (n + 1) / 2)-1;
    }
}