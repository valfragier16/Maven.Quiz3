package rocks.zipcode.io.quiz3.generics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        SomeType result = null;
        for (int i = 0; i < array.length; i++) {
            if ((getNumberOfOccurrences(array[i]) % 2) != 0) {
                result = array[i];
            }
        }
        return result;
    }

    public SomeType findEvenOccurringValue() {
        SomeType result = null;
        for (int i = 0; i < array.length; i++) {
            if ((getNumberOfOccurrences(array[i]) % 2) == 0) {
                result = array[i];
            }
        }
        return result;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
      Integer result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == (valueToEvaluate)) {
                result++;
            }
        }
        return result;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        List<SomeType> list = Arrays.stream(array)
                .filter(predicate::apply)
                .collect(Collectors.toList());
        return list.toArray((SomeType[]) Array.newInstance(array[0].getClass(), list.size()));
    }
}
