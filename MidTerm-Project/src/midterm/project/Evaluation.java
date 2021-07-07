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
public class Evaluation {

    private String teachername;
    private String stdname;
    private String coursename;
    private String assname;
    List<String> qlist = new ArrayList<>();
    List<String> markslist = new ArrayList<>();

    public String getstdname() {
        return stdname;
    }

     public String getteachername() {
        return teachername;
    }
    public String getcoursename() {
        return coursename;
    }

    public String getassname() {
        return assname;
    }

    public void setstdname(String b) {
        stdname = b;
    }

    public void setcoursename(String b) {
        coursename = b;
    }

    public void setassname(String b) {
        assname = b;
    }

    public void setteachername(String b) {
        teachername = b;
    }
}
