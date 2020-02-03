import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Stringcalculator stringcalculator =  new Stringcalculator();
        //System.out.println(Stringcalculator.Add("//4\n142"));
        //System.out.println(Stringcalculator.Add("//[(-_-')][%]\n1(-_-')2%3", "[(-_-')][%]"));
        String x = "//[(-_-')][%]\n1(-_-')2%3";
        System.out.println("*****************");
        System.out.println(Arrays.toString(x.split("[(-_-')][%]")));

    }
}
