package Array;

public class Main {
    public static void main(String[] args) {
        // Q: store a roll number
        int a = 19;

        // Q: store a person's name
        String name = "Shubham Tiwari";


        //Q: stores 5 roll numbers
        int roll1 = 23;
        int roll2 = 32;
        int roll3 = 54;

        // syntax
        // datatype[] variable_name = datatype[size];
        // store 5 roll numbers

        int[] rnos = new int[5];

        // or directly
        int[] rnos2 = {23, 12,34, 43};

        int[] ros; // declaration of array
        ros = new int[5]; // initialisation : here object is created

        System.out.println(ros[1]);

    }
}
