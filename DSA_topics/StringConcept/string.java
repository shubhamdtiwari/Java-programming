package DSA_topics.StringConcept;

public class string {
    public static void main(String[] args) {
        String p1 = "shubham";
        String p2 = "shubham"; // it is save in string pool in heap memory
        String p3 = "shubham";
        String p4 = "shubham";

        String p5 = p1;

        System.out.println(p5 == p1); // it will give true as it point to same object

        // here all person prefer to same object which is created in the heap memory

        p2 = "tiwari";

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        // from this above example we know that string is immutable

        System.out.println(p1 == p2);
        // it shows false as it is changed above as it create a new object in heap
        // memory

        System.out.println(p1 == p3);
        // it shows true as both p1 and p3 points to same object in heap memory pool

        // == checks if the refernce variables are pointing to same object

        // for creating two object in heap we use new keyword

        String a = new String("Shubham");
        String b = new String("Shubham");

        // now we have created two object in heap but outside the pool

        System.out.println(a == b); // it is compariter
        // it will give false as both a and b point to diffrent object in heap memory

        // for cheaking if values are equal

        System.out.println(a.equals(b)); // it is a method

    }
}
