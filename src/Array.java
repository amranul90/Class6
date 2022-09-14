import com.sun.source.tree.LambdaExpressionTree;

public class Array {
    public static void main(String[] args) {

        // array =used to store multiple values in a single variable

        String[] car = {"nissan", "honda", "toyota", "bmw", "lexus"};
        System.out.println(car[0]);
        System.out.println(car[3]);

       // Conditional statement
        // define conditions that are true or false and execute based on whether the condition is true .

        int money=10;
        if (money==10){
            System.out.println("i can get burger");
        }else
        if (money==20){
            System.out.println("i can get chips");
        }else
        if (money==40){
            System.out.println("i can get grocery");
        }
       // For loop
        //repetition control structure that allows you to efficiently write a loop that needs
       // to execute a specific number off time



        for (int A=0;A<10;A++){
            System.out.println(A);

        }
     //  While loop evaluates the textExpression inside the parenthesis() if the text evaluates to true
        //the code inside the while loop is executed


        int i=0;
        while (i<5){
            System.out.println(i);
            i++;
        }
        int num1=0;
        int num2=4;
        while (num1<5){
            System.out.println(num2);
            num1++;
        }

        //Do while loop
        // used to execute a block of statement continuously until the give condition is ture
        int s=0;
        do {
            System.out.println(s);
            s++;
        }while (s<5);





    }
}
