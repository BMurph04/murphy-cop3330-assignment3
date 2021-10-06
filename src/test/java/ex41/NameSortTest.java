package ex41;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static ex41.NameSort.namesList;

public class NameSortTest extends TestCase {

    @Test
    public void testArraySort(){

        ArrayList<String> actualNamesList = new ArrayList<>();
        String[] actualNames = { "Johnson, Jim","Jones, Aaron","Jones, Chris", "Ling, Mai", "Swift, Geoffrey", "Xiong, Fong", "Zarnecki, Sabrina"};
        actualNamesList.addAll(Arrays.asList(actualNames));

        NameSort.getNames();
        NameSort.sortNames();
        assertEquals(actualNamesList, namesList);

    }

}