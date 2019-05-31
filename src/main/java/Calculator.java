import com.googlecode.zohhak.api.TestWith;

public class Calculator {

    public int getSum(int x, int y) {
        return x+y;
    }

    public int getDivide(int x, int y) {
        return x/y;
    }

    public int getMultiple(int x, int y) {
        return x*y;
    }

    @TestWith({
            "La",
            "Ny",
            "Bo"
    })
    public void doSome(String city){
        System.out.println(city);


    }
}
