/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author PCMSI
 */
public class QuizQuestion {
    private int quiz_questionID, quizID;
    private String question_tile;

    public QuizQuestion() {
    }

    public QuizQuestion(int quiz_questionID, int quizID, String question_tile) {
        this.quiz_questionID = quiz_questionID;
        this.quizID = quizID;
        this.question_tile = question_tile;
    }

    public int getQuiz_questionID() {
        return quiz_questionID;
    }

    public void setQuiz_questionID(int quiz_questionID) {
        this.quiz_questionID = quiz_questionID;
    }

    public int getQuizID() {
        return quizID;
    }

    public void setQuizID(int quizID) {
        this.quizID = quizID;
    }

    public String getQuestion_tile() {
        return question_tile;
    }

    public void setQuestion_tile(String question_tile) {
        this.question_tile = question_tile;
    }
    
}
