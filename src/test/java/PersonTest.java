import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class PersonTest {

    @Test
    @Parameters({
            "17, false",
            "22, true"})
    public void personIsAdult(int age, boolean valid) {
        System.out.println(age + " - is " + valid);
    }


    @Test
    @Parameters({
            "LA",
            "NY",
            "Sudi Su"
    })
    public void testCitys(String city) {
        System.out.println(city);
    }

    @Test
    @FileParameters(value = "src/test/resources/test.csv", mapper = PersonMapper.class)
    public void loadParamsFromAnyFile(PersonTest.Person person) {
        System.out.println(person.toString());
    }

    public static class Person {


        private String name;
        private int age;

        public Person(Integer age) {
            this.age = age;
        }

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public boolean isAdult() {
            return age >= 18;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Person of age: " + age;
        }
    }


}
