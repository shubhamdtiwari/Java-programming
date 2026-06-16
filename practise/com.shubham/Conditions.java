package practise;

public class Conditions {
    public static void main(String[] args) {
        
        /*
        Synatx of if else statement

        if(boolran expression T or F){
        // body
        }else {
           // do this 
            }
        */

            int salary = 24500;

    //         if(salary > 10000) {
    //             // salary = salary + 2000;
    //             salary += 2000;
    //         }else {
    //             salary += 1000;
    //         }
    // }

            // multiple if else

                if (salary > 20000) {
                    salary += 3000;
                } else if (salary > 10000) {
                    salary += 2000;
                
                } else {
                    salary += 1000;
                }

                System.out.println(salary);
            }
}
