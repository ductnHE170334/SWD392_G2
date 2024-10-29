/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author PCMSI
 */
public class UserQuizAttempt {
    private int userID, quizID;
    private float score;
    private Date attemptDate;

    public UserQuizAttempt() {
    }

    public UserQuizAttempt(int userID, int quizID, float score, Date attemptDate) {
        this.userID = userID;
        this.quizID = quizID;
        this.score = score;
        this.attemptDate = attemptDate;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getQuizID() {
        return quizID;
    }

    public void setQuizID(int quizID) {
        this.quizID = quizID;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public Date getAttemptDate() {
        return attemptDate;
    }

    public void setAttemptDate(Date attemptDate) {
        this.attemptDate = attemptDate;
    }
    
}
