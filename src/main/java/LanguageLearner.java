import jdk.dynalink.linker.LinkerServices;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LanguageLearner {
        public static Scanner sc=new Scanner(System.in);
        List<Question> questions= new ArrayList<>();

    public LanguageLearner(){
        questions.add(new Question());
        run(questions.get(0));

    }

    public void run(Question question){
        while (true){
            System.out.println(question.getFullSentence());
            System.out.println(question.getIncompleteSentence());
            String input=sc.next();

            if (input.equalsIgnoreCase(question.getResult())){
                System.out.println("Richtig");
                break;
            }else {
                System.out.println("Falsch");
            }
        }
    }

    public static void main(String[] args) {
        new LanguageLearner();
    }
}
