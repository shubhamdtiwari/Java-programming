package StatementsWhiteSpaceAndIndenting;

public class Main {
    public static void main(String[] args) {
        int variable = 50;

        variable++; // the whole code including comma is a statement
        variable--;

        System.out.println("This is a test");

        System.out.println("this is" + 
            "anither" + 
            "still more."
        );

        int anotherVariable = 50;variable--;System.out.println("myVariable = " + variable);
        // we can write code in single line, it will always work if there is comma b/w the statements
        
    
    }
}
