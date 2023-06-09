package ifStatement;

public class ElseIfPractice1 {
    public static void main(String[] args) {

        /*
        score is 100 - 90 -> A
        score is 89 - 80 ->  B
        score is 79 - 70 --> C
        score lees than 70 --> Fail

        highest score can be 105
        "score is out of range - please check your entry"
         */

        int score = 10;

        if (score >=90 && score <=105 ){
            System.out.println("Letter grade is A");
        } else if (score >=80 && score <=89) {
            System.out.println("Letter grade is B");
        } else if (score >=70 && score <80) {
            System.out.println("Letter grade is C");
        } else if (score > 105) {
            System.out.println("score is out of range - please check your entry");
        } else {

            System.out.println("FAIL >> need to take the course again");
        }

    }
}
