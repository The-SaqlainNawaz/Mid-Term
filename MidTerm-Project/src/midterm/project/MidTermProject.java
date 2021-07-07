/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm.project;

import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author Proud To Be Muslims
 */
public class MidTermProject {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Administrator.getinstace().loadstudents();
        Administrator.getinstace().loadCourseData();
        Administrator.getinstace().loadteacher();
        Administrator.getinstace().loadenroll();
        Administrator.getinstace().loadAssessment();
        Administrator.getinstace().loadeva();
        for (int i = 0; i < Administrator.getinstace().stdlist.size(); i++) {
            System.out.println(Administrator.getinstace().stdlist.get(i).getName());
            for (String teacher : Administrator.getinstace().stdlist.get(i).teacher) {
                System.out.println(teacher);
            }
        }
        Login_Screen obj = new Login_Screen();
        obj.setVisible(true);

    }

}
