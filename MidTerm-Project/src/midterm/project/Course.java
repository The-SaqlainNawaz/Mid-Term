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
public class Course {

    private String TeacherName;
    private String courseTitle;
    private String courseID;
    private int creditHours;
    List<clo> clolist = new ArrayList<>();
    List<Student>stdlist=new ArrayList<>();

    public String getTeacherName() {
        return TeacherName;
    }

    public String getcourseTitle() {
        return courseTitle;
    }

    public String getcourseID() {
        return courseID;
    }

    public int getcreditHours() {
        return creditHours;
    }

    public void setcourseTitle(String b) {
        courseTitle = b;
    }

    public void setcourseID(String b) {
        courseID = b;
    }

    public void setcreditHours(int i) {
        creditHours = i;
    }

    public void setTeacherName(String b) {
        TeacherName = b;
    }

}
