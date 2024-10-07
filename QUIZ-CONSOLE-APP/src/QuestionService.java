import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];

    String selection[] = new String[5];
    
    public QuestionService(){
        System.out.println("Enter your answer in UPERCASE. Ex : A, B, C or D");
        questions[0] = new Question(1, "Which is your favourite subject ?", "Java", "CPPM", "C++", "DBMS", "A");
        questions[1] = new Question(2, "Which is your favourite city ?", "Berlin", "Munich", "Hamburg", "Neurnburg", "A");
        questions[2] = new Question(3, "Which is your favourite country ?", "Germany", "India", "Canada", "UK", "B");
        questions[3] = new Question(4, "Which is your favourite collage ?", "Sutex", "BNB", "BHBI", "IU", "D");
        questions[4] = new Question(5, "Which is your favourite laptop ?", "Mac", "Lenovo", "HP", "Dell", "C");
    }

    public void playQuiz(){

        int i = 0;
        for(Question q : questions){
            System.out.print(q.getId() + ". ");
            System.out.println(q.getQuestion());
            System.out.println("(A) " + q.getOpt1());
            System.out.println("(B) " + q.getOpt2());
            System.out.println("(C) " + q.getOpt3());
            System.out.println("(D) " + q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }

        System.out.println("Your answer are : ");
        for(String s : selection){
            System.out.println(s);
        }
        
    }

    public void printScore(){
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];

            if (actualAnswer.equals(userAnswer)) {
                score++;
            }
        }
        System.out.println("Your Score is : " + score + " out of " + questions.length);
    }

}
