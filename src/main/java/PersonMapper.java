import junitparams.mappers.CsvWithHeaderMapper;

import java.io.Reader;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonMapper extends CsvWithHeaderMapper {

     @Override
    public Object[] map(Reader reader) {
        Object[] map = super.map(reader);
        List<Object[]> result = new LinkedList<Object[]>();
        for (Object lineObj : map) {
            String line = (String) lineObj;
            result.add(new Object[] { line.substring(2), Integer.parseInt(line.substring(0, 1)) });
        }

        result.stream()
                .map(x->x.toString())
                .collect(Collectors.toList())
                .forEach(System.out::println);
        return result.toArray();
    }
}
