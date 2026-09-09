package DSA_topics.StringConcept;

import java.util.ArrayList;

public class operators {

    public static void main(String[] args) {
        System.out.println('a' + 'b'); // 195
        System.out.println("a" + "b"); // ab
        System.out.println((char) ('a' + 3)); // d

        System.out.println("a" + 1); // a1

        System.out.println("a" + 1);
        // this is same as after a few steps: "a" + "1"
        // integer will be converted to integer that will call toString()

        System.out.println("Shubh" + new ArrayList<>());

        System.out.println("Shubh" + 56);

        String ans = 56 + "" + new ArrayList<>();
        System.out.println(ans);
    }
}
