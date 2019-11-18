package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        ArrayList<String> waves = new ArrayList<>();
        String temp =  str.toLowerCase();
        boolean visisted = false;

        for(int i = 0; i < str.length(); i++){
            StringBuilder sb = new StringBuilder();;
            for(int j = 0; j <str.length(); j++){
                if(i==j){
                    if(Character.isAlphabetic(temp.charAt(j))){
                        sb.append(Character.toUpperCase(temp.charAt(j)));
                    }
                    else {
                        visisted = true;
                    }
                }
                else {
                    sb.append(temp.charAt(j));
                }
            }
            if(visisted){
                visisted = false;
            }
            else {
                waves.add(sb.toString());
            }
        }
        String[] result = waves.toArray(new String[waves.size()]);

        return result;
    }
}
