import java.util.Scanner;

public class QuestionService {
   Question[] questions = new Question[5];
   String selection[]=new String[5];

   public QuestionService(){
questions[0] = new Question(
    1,
    "Which programming language is platform-independent?",
    "C",
    "C++",
    "Java",
    "Assembly",
    "Java"
);

questions[1] = new Question(
    2,
    "Which keyword is used to inherit a class in Java?",
    "this",
    "super",
    "extends",
    "implements",
    "extends"
);

questions[2] = new Question(
    3,
    "Which method is the entry point of a Java program?",
    "start()",
    "run()",
    "main()",
    "init()",
    "main()"
);

questions[3] = new Question(
    4,
    "Which of the following is NOT a Java access modifier?",
    "public",
    "private",
    "protected",
    "friendly",
    "friendly"
);

questions[4] = new Question(
    5,
    "Which concept allows hiding implementation details in Java?",
    "Inheritance",
    "Polymorphism",
    "Encapsulation",
    "Abstraction",
    "Encapsulation"
);

   }

   public void playQuiz(){
      int i=0;
      for( Question q:questions){

         System.out.println("Question no :" + q.getId());
         System.out.println(q.getQuestion());
         System.out.println(q.getOpt1());
         System.out.println(q.getOpt2());
         System.out.println(q.getOpt3());
         System.out.println(q.getOpt4());
         Scanner sc =new Scanner(System.in);
         selection[i] =sc.nextLine();
         i++;
      }
      for(String s : selection){
System.out.println(s);
      }
   }
}
