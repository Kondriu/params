import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

public class JUnitStringUtilsParameterizedTest extends Assert {

    private final CharSequence testData;
    private final boolean expected;

    public JUnitStringUtilsParameterizedTest(final CharSequence testData,
                                             final boolean expected) {
        this.testData = testData;
        this.expected = expected;
    }

    @Test
    public void testIsEmpty() {
        String actual = String.valueOf(StringUtils.isEmpty(testData));
        System.out.println(actual);
        //final boolean actual = StringUtils.isEmpty(testData);
        //assertEquals(expected, actual);
    }

    @Parameterized.Parameters
    public static List<String> isCityList() {
        List<String> cityList = new ArrayList();
        cityList.add("NY");
        cityList.add("La");
        cityList.add("sdf");
        return cityList;
    }

}
