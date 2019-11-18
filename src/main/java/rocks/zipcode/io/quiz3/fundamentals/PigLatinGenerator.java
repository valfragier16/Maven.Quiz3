package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String[] strings = str.split(" ");
        StringBuilder sb =  new StringBuilder();

        for(String string: strings){
            if(VowelUtils.startsWithVowel(string)){
                sb.append(string);
                sb.append("way");
            } else if (VowelUtils.hasVowels(string) && (!VowelUtils.startsWithVowel(string))){
                sb.append(startsWithConsAndHasVowels(string));
            }
            else if (!VowelUtils.hasVowels(string)){
                sb.append(string);
                sb.append("ay");
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    private String startsWithConsAndHasVowels(String string){
        StringBuilder nonVowel =  new StringBuilder();
        StringBuilder sb =  new StringBuilder();
        int firstVowel = 0;

        for(int i =0; i< string.length(); i++) {
            if (!VowelUtils.isVowel(string.charAt(i))) {
                nonVowel.append(string.charAt(i));
            } else {
                firstVowel = i;
                nonVowel.toString();
                break;
            }
        }
        for(int j = firstVowel; j< string.length(); j++){
            sb.append(string.charAt(j));
        }
        sb.append(nonVowel);
        sb.append("ay");

        return sb.toString();
    }


}
