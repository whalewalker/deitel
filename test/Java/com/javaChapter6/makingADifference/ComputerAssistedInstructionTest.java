package Java.com.javaChapter6.makingADifference;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class ComputerAssistedInstructionTest {

    ComputerAssistedInstruction student;

    @BeforeEach
    void setUp() {
        student = new ComputerAssistedInstruction();
    }

    @AfterEach
    void tearDown() {
        student = null;
    }

    @Test
    void test_ifRandomNumberCanBeGenerated() {
        int rand1 = ComputerAssistedInstruction.generateRandomNumber();
        int rand2 = ComputerAssistedInstruction.generateRandomNumber();

        assertNotEquals(rand1, rand2);
    }

    @Test
    void test_randomMultiplicationQuestionCanBeGenerated() {
        String question1 = student.generateRandomQuestion();
        String question2 = student.generateRandomQuestion();
        assertNotEquals(question1, question2);
    }

    @Test
    void student_canAnswerAQuestionAndPass() {
        String question = JOptionPane.showInputDialog(null, student.generateRandomQuestion());
        int answer = Integer.parseInt(question);
        String result = student.checkAnswer(answer);
        assertEquals("pass", result);

    }

    @Test
    void student_canAnswerAQuestionAndFail(){
        String question = JOptionPane.showInputDialog(null, student.generateRandomQuestion());
        int answer = Integer.parseInt(question);
        String result = student.checkAnswer(answer);
        assertEquals("fail", result);
    }

    @Test
    void student_canExitQuiz(){
        String question = JOptionPane.showInputDialog(null, student.generateRandomQuestion());
        int answer = Integer.parseInt(question);
        String result = student.checkAnswer(answer);
        assertEquals("exit", result);
    }

    @Test
    void student_canFailAQuestionAndTheQuestionIsRepeated(){
        String question = student.generateRandomQuestion();
        int answer = Integer.parseInt(JOptionPane.showInputDialog(null, question));

        String result = student.checkAnswer(answer);

        while (!result.equals("exit")){
            if(result.equals("pass")){
                JOptionPane.showMessageDialog(null, "Very good!");
                question = student.generateRandomQuestion();
                answer = student.displayQuestion(question);
            }else if(result.equals("fail")){
                JOptionPane.showMessageDialog(null, "No. Please try again.");
                answer = student.displayQuestion(question);
            }
            result = student.checkAnswer(answer);
        }

        assertEquals("exit", result);


    }



}