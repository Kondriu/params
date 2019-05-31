import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParametricRegularExpressionTest {



@Parameterized.Parameters
    public static Collection<Object[]> getFiles() {
        Collection<Object[]> params = new ArrayList<Object[]>();
        for (File f : new File(".").listFiles()) {
            Object[] arr = new Object[] { f };
            params.add(arr);
        }
        return params;
    }

    private File file;

    public ParametricRegularExpressionTest(File file) {
        this.file = file;
    }


    @Test
    public void testY() {
        System.out.println(file.toString());
    }


}

