package keywordsAndExpression;

public class Main {
    public static void main(String[] args) {
        int int2 = 10;
        // we cannot name the variables with reserve keywords

        double kilometers = (100 * 1.609344); // whole line a valid statment
        // here (100 * 1.609344) is a expression which produce value

        int highScore = 50;

        if(highScore > 25) {
            highScore += 1000;
        }
        // here we can see multiple expression
        // expression does not include datatype and commas;

        int health = 100;

        if((health < 24) && (highScore > 100)){
            highScore = highScore - 1000;
        }
        // above code contains 6 expression

    }
}
