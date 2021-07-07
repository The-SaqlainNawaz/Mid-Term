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
public class Teacher {

    private String teacherName;
    private String cnic;
    private String tchrmail;
    private String tchrpass;
    List<String>listcoursename=new ArrayList<>();
    List<Course> courselist = new ArrayList<>();
    List<Assessment>assesslist=new ArrayList<>();
    List<Evaluation>evalist=new ArrayList<>();

    ////////////////////////////////////////////Setter /////////////////////////////////////
    /**
     *
     * setter for name
     *
     * @param b
     */
    public void setname(String b) {
        teacherName = b;
    }

    /**
     *
     * setter for cnic
     *
     * @param b
     */
    public void setcnic(String b) {
        cnic = b;
    }

    /**
     *
     * setter for mail
     *
     * @param b
     */
    public void setmail(String b) {
        tchrmail = b;
    }

    /**
     *
     * setter for pass
     *
     * @param b
     */
    public void setpass(String b) {
        tchrpass = b;
    }

    ///////////////////////////getter///////////////////////////////////
    /**
     *
     * setter for name
     *
     * @return String
     */
    public String getname() {
        return teacherName;
    }

    /**
     *
     * setter for cnic
     *
     * @return String
     */
    public String getcnic() {
        return cnic;
    }

    /**
     *
     * setter for mail
     *
     * @return String
     */
    public String getmail() {
        return tchrmail;
    }

    /**
     *
     * setter for pass
     *
     * @return String
     */
    public String getpass() {
        return tchrpass;
    }

    ////////////////////////////////////validator////////////////////////////
    /**
     *
     * Validator for name
     *
     * @param b
     * @return boolean
     */
    public boolean validName(String b) {
        boolean flag = false;
        int size = b.length();
        if (size <= 28) {
            for (int i = 0; i < size; i++) {
                if ((b.charAt(i) >= 'A' && b.charAt(i) <= 'Z') || (b.charAt(i) >= 'a' && b.charAt(i) <= 'z') || b.charAt(i) == ' ') {
                    flag = true;
                } else {
                    return false;
                }
            }
        }
        return flag;
    }

    /**
     *
     * Validator for cnic
     *
     * @param b
     * @return boolean
     */
    public boolean validcnic(String b) {
        boolean flag = false;
        if (b.length() == 13) {
            for (int i = 0; i < b.length(); i++) {
                if (b.charAt(i) >= '0' && b.charAt(i) <='9') {
                    flag = true;
                } else {
                    return false;
                }
            }
        }
        return flag;

    }

    /**
     *
     * Validator for mail
     *
     * @param b
     * @return boolean
     */
    public boolean validmail(String b) {
        boolean flag = false;
        int size = b.length();
        if (b.charAt(0) =='T' && b.charAt(1)=='H' && b.charAt(2) == '-') {
            for (int i = 3; i < b.length(); i++) {
                if (b.charAt(i) >= '0' && b.charAt(i) <= '9') {
                    flag = true;
                } else {
                    return false;
                }

            }
        }

        return flag;
    }

}
