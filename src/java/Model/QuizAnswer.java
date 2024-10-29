/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author PCMSI
 */
public class QuizAnswer {
    private int quiz_answerID,quiz_questionID;
    private String answer_text;
    private Boolean is_correct;

    public QuizAnswer() {
    }

    public QuizAnswer(int quiz_answerID, int quiz_questionID, String answer_text, Boolean is_correct) {
        this.quiz_answerID = quiz_answerID;
        this.quiz_questionID = quiz_questionID;
        this.answer_text = answer_text;
        this.is_correct = is_correct;
    }

    public int getQuiz_answerID() {
        return quiz_answerID;
    }

    public void setQuiz_answerID(int quiz_answerID) {
        this.quiz_answerID = quiz_answerID;
    }

    public int getQuiz_questionID() {
        return quiz_questionID;
    }

    public void setQuiz_questionID(int quiz_questionID) {
        this.quiz_questionID = quiz_questionID;
    }

    public String getAnswer_text() {
        return answer_text;
    }

    public void setAnswer_text(String answer_text) {
        this.answer_text = answer_text;
    }

    public Boolean getIs_correct() {
        return is_correct;
    }

    public void setIs_correct(Boolean is_correct) {
        this.is_correct = is_correct;
    }
    
}
