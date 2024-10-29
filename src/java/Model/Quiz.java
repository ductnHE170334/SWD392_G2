/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author PCMSI
 */
public class Quiz {
    private int quizID, courseID;
    private float min_pass_score;
    private String quizName;

    public Quiz() {
    }

    public Quiz(int quizID, int courseID, float min_pass_score, String quizName) {
        this.quizID = quizID;
        this.courseID = courseID;
        this.min_pass_score = min_pass_score;
        this.quizName = quizName;
    }

    public int getQuizID() {
        return quizID;
    }

    public void setQuizID(int quizID) {
        this.quizID = quizID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public float getMin_pass_score() {
        return min_pass_score;
    }

    public void setMin_pass_score(float min_pass_score) {
        this.min_pass_score = min_pass_score;
    }

    public String getQuizName() {
        return quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }
    
}
