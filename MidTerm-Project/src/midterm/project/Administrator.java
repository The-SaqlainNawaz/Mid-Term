/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm.project;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Proud To Be Muslims
 */
public class Administrator {

    List<Teacher> teacherlist = new ArrayList<>();
    List<Course> course = new ArrayList<>();
    List<Student> stdlist = new ArrayList<>();
    private int stdindex;
    private int tchrindex;
    private static Administrator instance;
    DefaultTableModel model = new DefaultTableModel();

    private Administrator() {

    }

    public int gtetchrindex() {
        return tchrindex;
    }

    public int getstdindex() {
        return stdindex;
    }

    public void evasave() {
        try {
            FileWriter write = new FileWriter("Evaluation.txt");
            String out = "";
            for (int i = 0; i < teacherlist.size(); i++) {
                for (int j = 0; j < teacherlist.get(i).evalist.size(); j++) {
                    out = out + teacherlist.get(i).evalist.get(j).getteachername() + ",";
                    out = out + teacherlist.get(i).evalist.get(j).getstdname() + ",";
                    out = out + teacherlist.get(i).evalist.get(j).getcoursename() + ",";
                    out = out + teacherlist.get(i).evalist.get(j).getassname() + "/";
                    for (int k = 0; k < teacherlist.get(i).evalist.get(j).qlist.size(); k++) {
                        if (k == teacherlist.get(i).evalist.get(j).qlist.size() - 1) {
                            out = out + teacherlist.get(i).evalist.get(j).qlist.get(k) + "-";
                        } else {
                            out = out + teacherlist.get(i).evalist.get(j).qlist.get(k) + ",";
                        }
                    }
                    for (int k = 0; k < teacherlist.get(i).evalist.get(j).markslist.size(); k++) {
                        if (k == teacherlist.get(i).evalist.get(j).markslist.size() - 1) {
                            out = out + teacherlist.get(i).evalist.get(j).markslist.get(k) + "\n";
                        } else {
                            out = out + teacherlist.get(i).evalist.get(j).markslist.get(k) + ",";
                        }
                    }
                }

            }
            write.write(out);
            write.flush();
            write.close();
        } catch (Exception ex) {

        }
    }

    public void showeeva(JTable table, int index) {
        model = new DefaultTableModel();
        Object[] coloumns = {"Student Name", "Assessment Name", "Questions", "Obtained Marks"};
        model.setColumnIdentifiers(coloumns);
        table.setModel(model);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for (int i = 0; i < teacherlist.get(index).evalist.size(); i++) {
            Object[] arr = new Object[4];
            arr[0] = teacherlist.get(index).evalist.get(i).getstdname();
            arr[1] = teacherlist.get(index).evalist.get(i).getassname();
            arr[2] = "";
            arr[3] = "";
            for (int j = 0; j < teacherlist.get(index).evalist.get(i).qlist.size(); j++) {
                if (j == teacherlist.get(index).evalist.get(i).qlist.size() - 1) {
                    arr[2] = arr[2] + teacherlist.get(index).evalist.get(i).qlist.get(j);
                    arr[3] = arr[3] + teacherlist.get(index).evalist.get(i).markslist.get(j);
                } else {
                    arr[2] = arr[2] + teacherlist.get(index).evalist.get(i).qlist.get(j) + ",";
                    arr[3] = arr[3] + teacherlist.get(index).evalist.get(i).markslist.get(j) + ",";
                }
            }
            model.addRow(arr);
        }
    }

    public boolean eva(int index, String course, String stdname, String assname, String qs, String mrks, String teacher) {
        boolean flag = false;
        Evaluation obj = new Evaluation();
        obj.setcoursename(course);
        obj.setstdname(stdname);
        obj.setteachername(teacher);
        obj.setassname(assname);
        String[] qs1 = qs.split(",");
        String[] qsmarks = mrks.split(",");
        for (int i = 0; i < qsmarks.length; i++) {
            obj.qlist.add(qs1[i]);
            obj.markslist.add(qsmarks[i]);
            flag = true;
        }
        teacherlist.get(index).evalist.add(obj);
        return flag;
    }

    public String questionview(String ass, int index) {
        String out = "";
        out = out + "QuestionName," + "Marks" + "\n";
        for (int i = 0; i < teacherlist.get(index).assesslist.size(); i++) {
            if (teacherlist.get(index).assesslist.get(i).getassessmentName().equals(ass)) {
                for (int j = 0; j < teacherlist.get(index).assesslist.get(i).questionslist.size(); j++) {

                    out = out + "Name:" + teacherlist.get(index).assesslist.get(i).questionslist.get(j).getquestion() + " Marks:" + teacherlist.get(index).assesslist.get(i).questionslist.get(j).getcomponentmarks() + "\n";
                }
            }
        }
        return out;
    }

    public void assessmentcombo(JComboBox box, int index, String course) {
        box.removeAllItems();
        for (int i = 0; i < teacherlist.get(index).assesslist.size(); i++) {
            if (course.equals(teacherlist.get(index).assesslist.get(i).getcourseName())) {
                box.addItem(teacherlist.get(index).assesslist.get(i).getassessmentName());
            }
        }
    }

    public void stdcombopertcher(JComboBox box, int index, String course) {
        box.removeAllItems();
        for (int i = 0; i < teacherlist.get(index).courselist.size(); i++) {
            if (course.equals(teacherlist.get(index).courselist.get(i).getcourseTitle())) {
                for (int j = 0; j < teacherlist.get(index).courselist.get(i).stdlist.size(); j++) {
                    box.addItem(teacherlist.get(index).courselist.get(i).stdlist.get(j).getName());
                }
            }
        }
    }

    public void assessmnettable(JTable table, int index) {
        model = new DefaultTableModel();
        Object[] coloumns = {"AssessName", "Marks", "Weightage", "Course"};
        model.setColumnIdentifiers(coloumns);
        table.setModel(model);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for (int i = 0; i < teacherlist.get(index).assesslist.size(); i++) {
            Object[] arr = new Object[4];
            arr[0] = teacherlist.get(index).assesslist.get(i).getassessmentName();
            arr[1] = teacherlist.get(index).assesslist.get(i).getmarks();
            arr[2] = teacherlist.get(index).assesslist.get(i).gettotalweightage();
            arr[3] = teacherlist.get(index).assesslist.get(i).getcourseName();
            model.addRow(arr);
        }
    }

    public String ViewRubrics(String course, int index) {
        String out = "";
        for (int i = 0; i < teacherlist.get(index).courselist.size(); i++) {
            if (course.equals(teacherlist.get(index).courselist.get(i).getcourseTitle())) {

                for (int j = 0; j < teacherlist.get(index).courselist.get(i).clolist.size(); j++) {
                    for (int k = 0; k < teacherlist.get(index).courselist.get(i).clolist.get(j).rubricslist.size(); k++) {
                        if (k == teacherlist.get(index).courselist.get(i).clolist.get(j).rubricslist.size() - 1) {
                            out = out + teacherlist.get(index).courselist.get(i).clolist.get(j).rubricslist.get(k).getrubricsName() + "\n";
                        } else {
                            out = out + teacherlist.get(index).courselist.get(i).clolist.get(j).rubricslist.get(k).getrubricsName() + ",";
                        }
                    }
                }

            }
        }
        return out;
    }

    public boolean addassessment(String name, String weightage, String marks, String qs, String qsmarks, String qrubrics, int index, String course, JLabel lab) {
        boolean flag = false;
        clo obj = new clo();
        Teacher onjt = new Teacher();
        Assessment ass = new Assessment();
        ass.settchername(teacherlist.get(index).getname());
        String[] qss = qs.split(",");
        String[] qssmarks = qsmarks.split(",");
        String[] qsrubrics = qrubrics.split(",");
        int converter = 0;
        int sum = 0;
        for (int i = 0; i < qssmarks.length; i++) {
            converter = Integer.parseInt(qssmarks[i]);
            sum = sum + converter;
        }
        converter = Integer.parseInt(marks);
        if (converter == sum) {
            if (obj.validNumbers(weightage) && obj.validNumbers(marks)) {
                ass.setassessmentName(name);
                converter = Integer.parseInt(weightage);
                ass.settotalweightage(converter);
                converter = Integer.parseInt(marks);
                ass.setmarks(converter);
                ass.setcourseName(course);
                for (int i = 0; i < qss.length; i++) {
                    assessQuestions vv = new assessQuestions();
                    converter = Integer.parseInt(qss[i]);
                    vv.setquestion(converter);
                    converter = Integer.parseInt(qssmarks[i]);
                    vv.setcomponentmarks(converter);
                    vv.setrubricsname(qsrubrics[i]);
                    ass.questionslist.add(vv);
                    flag = true;
                }
                teacherlist.get(index).assesslist.add(ass);
            } else {
                lab.setText("Validation Error");
            }
        } else {
            lab.setText("Questions Marks Didn't Match with Total Marks");
        }
        return flag;
    }

    public void coursecomboteacher(JComboBox box, int index) {
        for (int i = 0; i < teacherlist.get(index).courselist.size(); i++) {
            box.addItem(teacherlist.get(index).courselist.get(i).getcourseTitle());
        }
    }

    public void clostable(JTable table, int index) {
        model = new DefaultTableModel();
        Object[] coloumns = {"CLO Number", "Rubrics", "Course"};
        model.setColumnIdentifiers(coloumns);
        table.setModel(model);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for (int i = 0; i < teacherlist.get(index).courselist.size(); i++) {
            Object[] arr = new Object[3];
            arr[2] = teacherlist.get(index).courselist.get(i).getcourseTitle();
            for (int j = 0; j < teacherlist.get(index).courselist.get(i).clolist.size(); j++) {
                arr[1] = "";
                arr[0] = teacherlist.get(index).courselist.get(i).clolist.get(j).getclonumber();
                System.out.print(arr[0]);
                for (int k = 0; k < teacherlist.get(index).courselist.get(i).clolist.get(j).rubricslist.size(); k++) {
                    arr[1] = arr[1] + teacherlist.get(index).courselist.get(i).clolist.get(j).rubricslist.get(k).getrubricsName() + ",";
                }
                model.addRow(arr);
            }

        }
    }

    public void registerStudent(JTable table, int index) {
        model = new DefaultTableModel();
        Object[] coloumns = {"Name", "Reg.Number", "Department", "Section", "ID", "Course"};
        model.setColumnIdentifiers(coloumns);
        table.setModel(model);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for (int i = 0; i < teacherlist.get(index).courselist.size(); i++) {
            Object[] arr = new Object[6];
            for (int j = 0; j < teacherlist.get(index).courselist.get(i).stdlist.size(); j++) {
                arr[0] = teacherlist.get(index).courselist.get(i).stdlist.get(j).getName();
                arr[1] = teacherlist.get(index).courselist.get(i).stdlist.get(j).getregNo();
                arr[2] = "BS Computer Science";
                arr[3] = "C";
                arr[4] = teacherlist.get(index).courselist.get(i).stdlist.get(j).getID();
                arr[5] = teacherlist.get(index).courselist.get(i).getcourseTitle();
                model.addRow(arr);
            }
        }
    }

    public void stdtable(JTable table, int index) {
        model = new DefaultTableModel();
        Object[] coloumns = {"CourseTitle", "CreditHours", "Department", "Section", "Teacher", "Enrollement"};
        model.setColumnIdentifiers(coloumns);
        table.setModel(model);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for (int i = 0; i < course.size(); i++) {
            Object[] arr = new Object[6];
            arr[0] = course.get(i).getcourseTitle();
            arr[1] = course.get(i).getcreditHours();
            arr[2] = "BS Computer Science";
            arr[3] = "C";
            arr[4] = course.get(i).getTeacherName();
            if (stdlist.get(index).teacher.size() != 0) {
                for (int k = 0; k < stdlist.get(index).teacher.size(); k++) {
                    if (stdlist.get(index).teacher.get(k).equals(course.get(i).getTeacherName())) {
                        arr[5] = "Enrolled";
                    }
                }
            }
            model.addRow(arr);

        }
    }

    public static Administrator getinstace() {
        if (instance == null) {
            instance = new Administrator();
            return instance;
        } else {
            return instance;
        }
    }

    public void allcoursescombo(JComboBox box) {
        for (int i = 0; i < course.size(); i++) {
            box.addItem(course.get(i).getcourseTitle());

        }
    }

    public void availabeleassign(JComboBox box) {
        for (int i = 0; i < course.size(); i++) {
            if ("null".equals(course.get(i).getTeacherName())) {
                box.addItem(course.get(i).getcourseTitle());
            }

        }
    }

    public boolean addteacher(Teacher obj) {
        teacherlist.add(obj);
        return true;
    }

    public boolean addStudent(Student obj) {
        stdlist.add(obj);
        return true;
    }

    public boolean delstudent(String b) {
        boolean flag = false;
        for (int i = 0; i < stdlist.size(); i++) {
            if (b.equals(stdlist.get(i).getID())) {
                stdlist.remove(i);
                flag = true;
            }
        }
        return flag;
    }

    public boolean editstudent(String name, String reg, String id, String password, int i) {
        boolean flag = false;
        stdlist.get(i).setID(id);
        stdlist.get(i).setName(name);
        stdlist.get(i).setpass(password);
        stdlist.get(i).setregNo(reg);
        flag = true;

        return true;
    }

    public void saveAssessment() {
        try {
            FileWriter write = new FileWriter("Assessments.txt");
            String out = "";
            for (int i = 0; i < teacherlist.size(); i++) {
                for (int j = 0; j < teacherlist.get(i).assesslist.size(); j++) {
                    out = out + teacherlist.get(i).getname() + ",";
                    out = out + teacherlist.get(i).assesslist.get(j).getcourseName() + ",";
                    out = out + teacherlist.get(i).assesslist.get(j).getassessmentName() + ",";
                    out = out + teacherlist.get(i).assesslist.get(j).gettotalweightage() + ",";
                    out = out + teacherlist.get(i).assesslist.get(j).getmarks() + "/";
                    for (int k = 0; k < teacherlist.get(i).assesslist.get(j).questionslist.size(); k++) {

                        if (k == teacherlist.get(i).assesslist.get(j).questionslist.size() - 1) {
                            out = out + teacherlist.get(i).assesslist.get(j).questionslist.get(k).getrubricsname() + ",";
                            out = out + teacherlist.get(i).assesslist.get(j).questionslist.get(k).getcomponentmarks() + ",";
                            out = out + teacherlist.get(i).assesslist.get(j).questionslist.get(k).getquestion() + "\n";
                        } else {
                            out = out + teacherlist.get(i).assesslist.get(j).questionslist.get(k).getrubricsname() + ",";
                            out = out + teacherlist.get(i).assesslist.get(j).questionslist.get(k).getcomponentmarks() + ",";
                            out = out + teacherlist.get(i).assesslist.get(j).questionslist.get(k).getquestion() + "-";
                        }
                    }
                }
            }
            write.write(out);
            write.flush();
            write.close();
        } catch (Exception ex) {

        }
    }

    public void loadAssessment() {
        try {
            FileReader read = new FileReader("Assessments.txt");
            BufferedReader readbuff = new BufferedReader(read);
            String in = "-1";
            int index = 0;
            while (in != null) {
                in = readbuff.readLine();
                String[] arr = in.split("/");
                String[] assessatt = arr[0].split(",");
                String[] assessqs = arr[1].split("-");
                Assessment obj = new Assessment();
                for (int i = 0; i < teacherlist.size(); i++) {
                    if (assessatt[0].equals(teacherlist.get(i).getname())) {
                        index = i;
                    }
                }
                obj.settchername(assessatt[0]);
                obj.setcourseName(assessatt[1]);
                obj.setassessmentName(assessatt[2]);
                int l = Integer.parseInt(assessatt[3]);
                obj.settotalweightage(l);
                int p = Integer.parseInt(assessatt[4]);
                obj.setmarks(p);
                for (int j = 0; j < assessqs.length; j++) {
                    String[] eachqs = assessqs[j].split(",");
                    assessQuestions qobj = new assessQuestions();
                    qobj.setrubricsname(eachqs[0]);
                    int comp = Integer.parseInt(eachqs[1]);
                    qobj.setcomponentmarks(comp);
                    int comp2 = Integer.parseInt(eachqs[2]);
                    qobj.setquestion(comp2);
                    obj.questionslist.add(qobj);
                }
                teacherlist.get(index).assesslist.add(obj);

            }

        } catch (Exception ex) {

        }
    }

    public void saveStudent() {
        try {
            FileWriter save = new FileWriter("Students.txt");
            String out = "";
            for (int i = 0; i < stdlist.size(); i++) {
                out = out + stdlist.get(i).getName() + ",";
                out = out + stdlist.get(i).getregNo() + ",";
                out = out + stdlist.get(i).getID() + ",";
                out = out + stdlist.get(i).getpass() + "\n";
            }
            save.write(out);
            save.flush();
            save.close();
        } catch (Exception ex) {

        }
    }

    public void loadstudents() {
        try {
            FileReader read = new FileReader("Students.txt");
            BufferedReader readbuff = new BufferedReader(read);
            String input = "-1";
            while (input != "") {
                input = readbuff.readLine();
                String[] arr = input.split(",");
                Student obj = new Student();
                obj.setName(arr[0]);
                obj.setregNo(arr[1]);
                obj.setID(arr[2]);
                obj.setpass(arr[3]);
                stdlist.add(obj);
            }
        } catch (Exception ex) {

        }
    }

    public void saveCourses() {
        try {
            FileWriter write = new FileWriter("Courses.txt");
            String out = "";
            for (int i = 0; i < course.size(); i++) {
                out = out + course.get(i).getcourseTitle() + ",";
                out = out + course.get(i).getcourseID() + ",";
                out = out + course.get(i).getcreditHours() + ",";
                out = out + course.get(i).getTeacherName() + "/";
                for (int j = 0; j < course.get(i).clolist.size(); j++) {
                    if (j == course.get(i).clolist.size() - 1) {
                        out = out + course.get(i).clolist.get(j).getclonumber() + "/";
                    } else {
                        out = out + course.get(i).clolist.get(j).getclonumber() + ",";
                    }
                }
                for (int j = 0; j < course.get(i).clolist.size(); j++) {
                    for (int k = 0; k < course.get(i).clolist.get(j).rubricslist.size(); k++) {
                        if (j == course.get(i).clolist.size() - 1 && k == course.get(i).clolist.get(j).rubricslist.size() - 1) {
                            out = out + course.get(i).clolist.get(j).rubricslist.get(k).getrubricsName() + "/";
                        } else if (k == course.get(i).clolist.get(j).rubricslist.size() - 1) {
                            out = out + course.get(i).clolist.get(j).rubricslist.get(k).getrubricsName() + "-";
                        } else {
                            out = out + course.get(i).clolist.get(j).rubricslist.get(k).getrubricsName() + ",";
                        }
                    }
                }
                for (int j = 0; j < course.get(i).clolist.size(); j++) {
                    for (int k = 0; k < course.get(i).clolist.get(j).rubricslist.size(); k++) {
                        for (int p = 0; p < course.get(i).clolist.get(j).rubricslist.get(k).levellist.size(); p++) {
                            if (j == course.get(i).clolist.size() - 1 && k == course.get(i).clolist.get(j).rubricslist.size() - 1 && p == course.get(i).clolist.get(j).rubricslist.get(k).levellist.size() - 1) {
                                out = out + course.get(i).clolist.get(j).rubricslist.get(k).levellist.get(p).getlevelname() + ",";
                                out = out + course.get(i).clolist.get(j).rubricslist.get(k).levellist.get(p).gettorder() + ",";
                                out = out + course.get(i).clolist.get(j).rubricslist.get(k).levellist.get(p).getpercentage() + "\n";

                            } else if (k == course.get(i).clolist.get(j).rubricslist.size() - 1 && p == course.get(i).clolist.get(j).rubricslist.get(k).levellist.size() - 1) {
                                out = out + course.get(i).clolist.get(j).rubricslist.get(k).levellist.get(p).getlevelname() + ",";
                                out = out + course.get(i).clolist.get(j).rubricslist.get(k).levellist.get(p).gettorder() + ",";
                                out = out + course.get(i).clolist.get(j).rubricslist.get(k).levellist.get(p).getpercentage() + "=";
                            } else if (p == course.get(i).clolist.get(j).rubricslist.get(k).levellist.size() - 1) {
                                out = out + course.get(i).clolist.get(j).rubricslist.get(k).levellist.get(p).getlevelname() + ",";
                                out = out + course.get(i).clolist.get(j).rubricslist.get(k).levellist.get(p).gettorder() + ",";
                                out = out + course.get(i).clolist.get(j).rubricslist.get(k).levellist.get(p).getpercentage() + "_";
                            } else {
                                out = out + course.get(i).clolist.get(j).rubricslist.get(k).levellist.get(p).getlevelname() + ",";
                                out = out + course.get(i).clolist.get(j).rubricslist.get(k).levellist.get(p).gettorder() + ",";
                                out = out + course.get(i).clolist.get(j).rubricslist.get(k).levellist.get(p).getpercentage() + "-";
                            }

                        }
                    }
                }
            }
            write.write(out);
            write.flush();
            write.close();
        } catch (Exception ex) {

        }

    }

    public void loadCourseData() {
        try {
            FileReader read = new FileReader("Courses.txt");
            BufferedReader readbuff = new BufferedReader(read);
            String input = "-1";
            int index = 0;
            int converter;
            while (input != "") {
                input = readbuff.readLine();
                String[] splitter = input.split("/");

                ///////course set//////
                Course courseobj = new Course();
                String[] coursedetail = splitter[0].split(",");
                courseobj.setcourseTitle(coursedetail[0]);
                courseobj.setcourseID(coursedetail[1]);
                converter = Integer.parseInt(coursedetail[2]);
                courseobj.setcreditHours(converter);
                courseobj.setTeacherName(coursedetail[3]);
                //  System.out.println(coursedetail[3]);
                course.add(courseobj);

                ////////////clo set////////
                String[] clo = splitter[1].split(",");
                for (int i = 0; i < clo.length; i++) {
                    clo cloobj = new clo();
                    converter = Integer.parseInt(clo[i]);
                    cloobj.setclonumber(converter);
                    course.get(index).clolist.add(cloobj);
                }

                /////////rubrics//////////
                String[] rubricsclowise = splitter[2].split("-");
                for (int i = 0; i < course.get(index).clolist.size(); i++) {
                    String[] ecahrubric = rubricsclowise[i].split(",");
                    for (int j = 0; j < ecahrubric.length; j++) {
                        Rubrics rubobj = new Rubrics();
                        rubobj.setrubricsName(ecahrubric[j]);
                        course.get(index).clolist.get(i).rubricslist.add(rubobj);
                    }
                }

                /////////////////rubricslevel///////
                String[] equalsplit = splitter[3].split("=");
                for (int i = 0; i < course.get(index).clolist.size(); i++) {
                    String[] rubricdiv = equalsplit[i].split("_");
                    for (int j = 0; j < course.get(index).clolist.get(i).rubricslist.size(); j++) {
                        String[] rubatt = rubricdiv[j].split("-");
                        for (int k = 0; k < rubatt.length; k++) {
                            String[] last = rubatt[k].split(",");
                            RubricsLevel lvlobj = new RubricsLevel();
                            lvlobj.setlevelname(last[0]);
                            converter = Integer.parseInt(last[1]);
                            lvlobj.setorder(converter);
                            converter = Integer.parseInt(last[2]);
                            lvlobj.setpercentage(converter);
                            course.get(index).clolist.get(i).rubricslist.get(j).levellist.add(lvlobj);
                        }
                    }
                }
//
//                System.out.println(course.size());
//                System.out.println(course.get(index).clolist.size());
//                for (int i = 0; i < course.get(index).clolist.size(); i++) {
//                    System.out.println(course.get(index).clolist.get(i).rubricslist.size());
//                }
//                for (int i = 0; i < course.get(index).clolist.size(); i++) {
//                    for (int j = 0; j < course.get(index).clolist.get(i).rubricslist.size(); j++) {
//                        System.out.println(course.get(index).clolist.get(i).rubricslist.get(j).levellist.size());
//                    }
//                }
                index++;
            }
        } catch (Exception ex) {

        }
    }

    public void saveTeacher() {
        try {
            FileWriter write = new FileWriter("Teachers.txt");
            String out = "";
            for (int i = 0; i < teacherlist.size(); i++) {
                out = out + teacherlist.get(i).getname() + ",";
                out = out + teacherlist.get(i).getcnic() + ",";
                out = out + teacherlist.get(i).getmail() + ",";
                out = out + teacherlist.get(i).getpass() + "/";
                for (int j = 0; j < teacherlist.get(i).listcoursename.size(); j++) {
                    if (j == teacherlist.get(i).listcoursename.size() - 1) {
                        out = out + teacherlist.get(i).listcoursename.get(j) + "\n";
                    } else {
                        out = out + teacherlist.get(i).listcoursename.get(j) + ",";
                    }
                }
            }
            write.write(out);
            write.flush();
            write.close();
        } catch (Exception ex) {

        }

    }

    public void loadteacher() {
        try {
            FileReader read = new FileReader("Teachers.txt");
            BufferedReader readbuff = new BufferedReader(read);
            String in = "-1";
            while (in != null) {
                in = readbuff.readLine();
                String[] splitter = in.split("/");
                String[] teacher = splitter[0].split(",");
                String[] course = splitter[1].split(",");
                Teacher obj = new Teacher();
                obj.setname(teacher[0]);
                obj.setcnic(teacher[1]);
                obj.setmail(teacher[2]);
                obj.setpass(teacher[3]);
                for (int i = 0; i < course.length; i++) {
                    obj.listcoursename.add(course[i]);
                }

                teacherlist.add(obj);
            }
        } catch (Exception ex) {

        }
    }

    public boolean getstudenyindex(String id, String pass) {
        boolean flag = false;
        for (int i = 0; i < stdlist.size(); i++) {
            if (id.equals(stdlist.get(i).getID()) && pass.equals(stdlist.get(i).getpass())) {
                flag = true;
                stdindex = i;
            }
        }
        return flag;
    }

    public void saveenroll() {
        try {
            FileWriter wright = new FileWriter("StudentEnroll.txt");
            String out = "";
            for (int i = 0; i < stdlist.size(); i++) {
                if (stdlist.get(i).teacher.isEmpty()) {
                    out = out + stdlist.get(i).getName() + "\n";
                } else {
                    out = out + stdlist.get(i).getName() + ",";
                    for (int j = 0; j < stdlist.get(i).teacher.size(); j++) {
                        if (j == stdlist.get(i).teacher.size() - 1) {
                            out = out + stdlist.get(i).teacher.get(j) + "\n";
                        } else {
                            out = out + stdlist.get(i).teacher.get(j) + ",";
                        }
                    }
                }
            }
            wright.write(out);
            wright.flush();
            wright.close();
        } catch (Exception ex) {

        }
    }

    public void loadenroll() {
        try {
            FileReader read = new FileReader("StudentEnroll.txt");
            BufferedReader readbuff = new BufferedReader(read);
            String in = "-1";
            while (in != null) {
                in = readbuff.readLine();
                String[] splitter = in.split(",");
                if (splitter.length == 1) {

                } else {
                    for (int i = 0; i < stdlist.size(); i++) {
                        if (splitter[0].equals(stdlist.get(i).getName())) {
                            for (int j = 1; j < splitter.length; j++) {
                                stdlist.get(i).teacher.add(splitter[j]);
                            }
                        }
                    }
                }
            }
        } catch (Exception ex) {

        }
    }

    public boolean getteacherindex(String id, String pass) {
        boolean flag = false;
        for (int i = 0; i < teacherlist.size(); i++) {
            if (id.equals(teacherlist.get(i).getmail()) && pass.equals(teacherlist.get(i).getpass())) {
                flag = true;
                tchrindex = i;
            }
        }
        return flag;
    }

    public void loadcourseandstudentinteacher(int index) {
        String name = teacherlist.get(index).getname();
        for (int i = 0; i < course.size(); i++) {
            if (name.equals(course.get(i).getTeacherName())) {
                Course obj = new Course();
                obj.setTeacherName(course.get(i).getTeacherName());
                obj.setcourseTitle(course.get(i).getcourseTitle());
                obj.setcourseID(course.get(i).getcourseID());
                obj.setcreditHours(course.get(i).getcreditHours());
                obj.clolist = course.get(i).clolist;
                teacherlist.get(index).courselist.add(obj);
            }
        }
        for (int i = 0; i < teacherlist.get(index).courselist.size(); i++) {

            if (name.equals(teacherlist.get(index).courselist.get(i).getTeacherName())) {
                for (int j = 0; j < stdlist.size(); j++) {
                    for (int k = 0; k < stdlist.get(j).teacher.size(); k++) {
                        if (stdlist.get(j).teacher.get(k).equals(name)) {
                            Student obj = new Student();
                            obj.setName(stdlist.get(j).getName());
                            obj.setID(stdlist.get(j).getID());
                            obj.setpass(stdlist.get(j).getpass());
                            obj.setregNo(stdlist.get(j).getregNo());
                            obj.teacher = stdlist.get(j).teacher;
                            teacherlist.get(index).courselist.get(i).stdlist.add(obj);
                        }
                    }
                }
            }
        }
    }

    public void loadeva() {
        try {
            FileReader read = new FileReader("Evaluation.txt");
            BufferedReader readbuff = new BufferedReader(read);
            String in = "-1";
            int index = 0;
            while (in != null) {
                in = readbuff.readLine();
                String[] splitter = in.split("/");
                String[] att = splitter[0].split(",");
                String[] qsandmrk = splitter[1].split("-");
                for (int i = 0; i < teacherlist.size(); i++) {
                    if (teacherlist.get(i).getname().equals(att[0])) {
                        index = i;
                    }
                }
                Evaluation obj = new Evaluation();
                obj.setteachername(att[0]);
                obj.setstdname(att[1]);
                obj.setcoursename(att[2]);
                obj.setassname(att[3]);
                String[] q = qsandmrk[0].split(",");
                String[] mrks = qsandmrk[1].split(",");
                for (int i = 0; i < q.length; i++) {
                    obj.qlist.add(q[i]);
                }
                for (int i = 0; i < mrks.length; i++) {
                    obj.markslist.add(mrks[i]);
                }
                teacherlist.get(index).evalist.add(obj);
            }
            read.close();
            readbuff.close();
        } catch (Exception ex) {

        }
    }

    public void saveData(String filename, int index) {
        try {
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            int obtmarks = 0;
            int tmarks = 0;
            int converter=0;
            for (int i = 0; i < teacherlist.get(index).evalist.size(); i++) {

            }

            bw.write("Student Name,Assessment Name,Course Name,Marks Gained,Total Marks\n");

            for (int i = 0; i < teacherlist.get(index).evalist.size(); i++) {
                for (int k = 0; k < teacherlist.get(index).evalist.get(i).markslist.size(); k++) {
                    converter=Integer.parseInt( teacherlist.get(index).evalist.get(i).markslist.get(k));
                    obtmarks = obtmarks + converter;
                }
                String course = teacherlist.get(index).evalist.get(i).getcoursename();
                String ass = teacherlist.get(index).evalist.get(i).getassname();
                for (int k = 0; k < teacherlist.get(index).assesslist.size(); k++) {
                    if (course.equals(teacherlist.get(index).assesslist.get(k).getcourseName()) && ass.equals(teacherlist.get(index).assesslist.get(k).getassessmentName())) {
                        tmarks = tmarks + teacherlist.get(index).assesslist.get(k).getmarks();
                    }
                }

                bw.write(teacherlist.get(index).evalist.get(i).getstdname() + ","
                        + teacherlist.get(index).evalist.get(i).getassname() + ","
                        +teacherlist.get(index).evalist.get(i).getcoursename()+","
                        + obtmarks + ","
                        + tmarks + "\n"
                );
            }

            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception ex) {

        }

    }

}
