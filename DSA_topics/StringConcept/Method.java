import java.util.Arrays;

public class Method {
    public static void main(String[] args) {

        String name = "Shubham";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("     Shubh  ".strip());

        // this method are works on copy of string as String is immutable
    }
}
