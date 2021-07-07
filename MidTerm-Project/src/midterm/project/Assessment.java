/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm.project;

import java.util.*;

/**
 *
 * @author Proud To Be Muslims
 */
public class Assessment {

    private String courseName;
    private String assessmentName;
    private int totalweightage;
    private int marks;
    private String tchername;
    List<assessQuestions> questionslist = new ArrayList();

    public void settchername(String a) {
        tchername = a;
    }

    public String gettchername() {
        return tchername;
    }

    public void setcourseName(String a) {
        courseName = a;
    }

    public void settotalweightage(int a) {
        totalweightage = a;
    }

    public void setassessmentName(String a) {
        assessmentName = a;
    }

    public void setmarks(int a) {
        marks = a;
    }

    public String getcourseName() {
        return courseName;
    }

    public int gettotalweightage() {
        return totalweightage;
    }

    public String getassessmentName() {
        return assessmentName;
    }

    public int getmarks() {
        return marks;
    }
}
