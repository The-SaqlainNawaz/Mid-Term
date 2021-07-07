/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm.project;

import static java.awt.Color.green;
import static java.awt.Color.red;
import java.util.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Proud To Be Muslims
 */
public class Admin_GUI extends javax.swing.JFrame {

    int teacherindexi = 0;
    int courseindexi = 0;
    DefaultTableModel model = new DefaultTableModel();
    DefaultTableModel modelCourse = new DefaultTableModel();

    public void removerow(int row) {
        model.removeRow(row);
    }

    public boolean TeacheraddValidate(String name, String cnic, String mail) {
        boolean flag = true;
        Teacher obj = new Teacher();
        if (obj.validName(name)) {

        } else {
            jTextField1.setForeground(red);
            jTextField1.setText("Should Contains Alphabtes");
            flag = false;
        }
        if (obj.validcnic(cnic)) {

        } else {
            jTextField2.setForeground(red);
            jTextField2.setText("Should Contains 13 Integer");
            flag = false;
        }
        if (obj.validmail(mail)) {

        } else {
            jTextField5.setForeground(red);
            jTextField5.setText("Format Should be TH-xxxxx(integer)");
            flag = false;
        }

        return flag;
    }

    public boolean StudentaddValidate(String name, String cnic, String mail) {
        boolean flag = true;
        Teacher obj = new Teacher();
        Student obj1 = new Student();
        if (obj.validName(name)) {

        } else {
            jTextField4.setForeground(red);
            jTextField4.setText("Should Contains Alphabtes");
            flag = false;
        }
        if (obj1.validregNo(cnic)) {

        } else {
            jTextField7.setForeground(red);
            jTextField7.setText("Format Should Like 2020-CS-XXX(integer)");
            flag = false;
        }
        if (obj1.validid(mail)) {

        } else {
            jTextField11.setForeground(red);
            jTextField11.setText("Format Should be ST-xxxxx(integer)");
            flag = false;
        }

        return flag;
    }

    public void addcolumTableTeacher() {
        Object[] coloumns = {"Name", "Department", "Section", "UserID", "Courses"};
        model.setColumnIdentifiers(coloumns);
        jTable6.setModel(model);
    }

    public void studenttable(JTable table) {
        model = new DefaultTableModel();
        Object[] coloumns = {"Name", "Reg.No.", "Department", "Section", "UserID"};
        model.setColumnIdentifiers(coloumns);
        jTable4.setModel(model);
        DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
        for (int i = 0; i < Administrator.getinstace().stdlist.size(); i++) {
            Object[] arr = new Object[5];
            arr[0] = Administrator.getinstace().stdlist.get(i).getName();
            arr[1] = Administrator.getinstace().stdlist.get(i).getregNo();
            arr[2] = "Computer Science";
            arr[3] = "C";
            arr[4] = Administrator.getinstace().stdlist.get(i).getID();
            model.addRow(arr);
        }
    }

    public void showCourseTable() {
        modelCourse = new DefaultTableModel();
        Object[] coloumns = {"CourseTitle", "CourseID", "Department", "Semester", "Section", "Credit Hours"};
        modelCourse.setColumnIdentifiers(coloumns);
        jTable5.setModel(modelCourse);
        DefaultTableModel model = (DefaultTableModel) jTable5.getModel();
        for (int i = 0; i < Administrator.getinstace().course.size(); i++) {
            Object[] arr = new Object[6];
            arr[0] = Administrator.getinstace().course.get(i).getcourseTitle();
            arr[1] = Administrator.getinstace().course.get(i).getcourseID();
            arr[2] = "Computer Science";
            arr[3] = "1";
            arr[4] = "C";
            arr[5] = Administrator.getinstace().course.get(i).getcreditHours();
            modelCourse.addRow(arr);
        }
    }

    public void showTableTeacher(JTable table) {
        //   model=new DefaultTableModel();
        model = new DefaultTableModel();
        Object[] coloumns = {"Name", "Department", "Section", "UserID", "Courses"};
        model.setColumnIdentifiers(coloumns);
        table.setModel(model);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for (int i = 0; i < Administrator.getinstace().teacherlist.size(); i++) {
            Object[] arr = new Object[5];
            arr[0] = Administrator.getinstace().teacherlist.get(i).getname();
            arr[1] = "Computer Science";
            arr[2] = "C";
            arr[3] = Administrator.getinstace().teacherlist.get(i).getmail();
            arr[4] = "";
            for (int j = 0; j < Administrator.getinstace().teacherlist.get(i).listcoursename.size(); j++) {
                if (j == Administrator.getinstace().teacherlist.get(i).listcoursename.size() - 1) {
                    arr[4] = arr[4] + Administrator.getinstace().teacherlist.get(i).listcoursename.get(j);
                } else {
                    arr[4] = arr[4] + Administrator.getinstace().teacherlist.get(i).listcoursename.get(j) + ",";
                }
            }
            model.addRow(arr);
        }
    }

    /**
     * Creates new form Admin_GUI
     */
    public Admin_GUI() {
        initComponents();
        Homepanel.setVisible(true);
        teacherpanel.setVisible(false);
        studentpanel.setVisible(false);
        coursepanel.setVisible(false);
        jPanel11.setVisible(false);
        AssignCourse.setVisible(false);
        edittecaherpanel.setVisible(false);
        jButton11.setVisible(false);
        updateTeacher2.setVisible(false);
        editstudentpanellllll.setVisible(false);
        Administrator.getinstace().allcoursescombo(jComboBox1);

        jComboBox1.setVisible(false);
        showCourseTable();
        showTableTeacher(jTable5);
        showTableTeacher(jTable6);
        studenttable(jTable4);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuTab = new javax.swing.JPanel();
        menustarter = new javax.swing.JLabel();
        profile_Picture = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        MenuPanel = new javax.swing.JPanel();
        hometab = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Homepanel = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        teacherpanel = new javax.swing.JPanel();
        menupanel1 = new javax.swing.JPanel();
        addteacher1 = new javax.swing.JLabel();
        coursesetting1 = new javax.swing.JLabel();
        rev1 = new javax.swing.JLabel();
        featurepanel = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        updateTeacher = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jTextField22 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        addteacherpanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField13 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        courseteacherpanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        edittecaherpanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        AssignCourse = new javax.swing.JPanel();
        updateTeacher1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jTextField27 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton11 = new javax.swing.JButton();
        updateTeacher2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jTextField33 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton13 = new javax.swing.JButton();
        studentpanel = new javax.swing.JPanel();
        menupanel2 = new javax.swing.JPanel();
        addteacher2 = new javax.swing.JLabel();
        rev2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        addstudetnpanel = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField11 = new javax.swing.JTextField();
        editstudentpanel = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        editstudentpanellllll = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        jTextField38 = new javax.swing.JTextField();
        coursepanel = new javax.swing.JPanel();
        menupanel3 = new javax.swing.JPanel();
        coursesetting2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        editcoursespanel = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome Admin");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setUndecorated(true);
        setResizable(false);

        MenuTab.setBackground(new java.awt.Color(64, 25, 255));

        menustarter.setBackground(new java.awt.Color(13, 5, 54));
        menustarter.setForeground(new java.awt.Color(255, 255, 255));
        menustarter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-home-24.png"))); // NOI18N
        menustarter.setText("Home");
        menustarter.setOpaque(true);
        menustarter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menustarterMouseClicked(evt);
            }
        });

        profile_Picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-user-male-100.png"))); // NOI18N

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Saqlain Nawaz");

        MenuPanel.setBackground(new java.awt.Color(64, 25, 255));

        hometab.setBackground(new java.awt.Color(13, 5, 54));
        hometab.setForeground(new java.awt.Color(255, 255, 255));
        hometab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-teacher-24.png"))); // NOI18N
        hometab.setText("Manage Teacher");
        hometab.setOpaque(true);
        hometab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hometabMouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(13, 5, 54));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-man-student-24.png"))); // NOI18N
        jLabel3.setText("Manage Student");
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(13, 5, 54));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-course-assign-24.png"))); // NOI18N
        jLabel4.setText("View Courses");
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-duolingo-logo-20.png"))); // NOI18N
        jLabel6.setText("Powered By The-SaQii");

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hometab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(hometab, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        jLabel5.setBackground(new java.awt.Color(13, 5, 54));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-exit-24.png"))); // NOI18N
        jLabel5.setText("Logout");
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Loggined as Admin");

        javax.swing.GroupLayout MenuTabLayout = new javax.swing.GroupLayout(MenuTab);
        MenuTab.setLayout(MenuTabLayout);
        MenuTabLayout.setHorizontalGroup(
            MenuTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menustarter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(MenuTabLayout.createSequentialGroup()
                .addGroup(MenuTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuTabLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2))
                    .addComponent(profile_Picture))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuTabLayout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        MenuTabLayout.setVerticalGroup(
            MenuTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuTabLayout.createSequentialGroup()
                .addGroup(MenuTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(profile_Picture, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addGroup(MenuTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuTabLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(MenuTabLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menustarter, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(MenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Homepanel.setBackground(new java.awt.Color(255, 204, 0));

        jLabel43.setBackground(new java.awt.Color(0, 0, 0));
        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 0));
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-man-student-24.png"))); // NOI18N
        jLabel43.setText("Hradworking is The Key To Success");

        jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(0, 0, 0));
        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-teacher-24.png"))); // NOI18N
        jLabel56.setText("Respect The Teachers as They Make you Stand in the World as an Successfull person");

        jLabel57.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(0, 0, 0));
        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-batch-assign-20.png"))); // NOI18N
        jLabel57.setText("Stay With your group ..Together we Stand and alone we Fall");

        jLabel58.setForeground(new java.awt.Color(0, 0, 0));
        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/midterm/project/icons8-protection-mask-100.png"))); // NOI18N
        jLabel58.setText("Wear Mask ");

        jLabel59.setForeground(new java.awt.Color(0, 0, 0));
        jLabel59.setText("Wear Mask Save Yourself and Save Other");

        jLabel60.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(0, 0, 0));
        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/midterm/project/icons8-microbe-48.png"))); // NOI18N
        jLabel60.setText("Covid 19");

        javax.swing.GroupLayout HomepanelLayout = new javax.swing.GroupLayout(Homepanel);
        Homepanel.setLayout(HomepanelLayout);
        HomepanelLayout.setHorizontalGroup(
            HomepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomepanelLayout.createSequentialGroup()
                .addGroup(HomepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomepanelLayout.createSequentialGroup()
                        .addGroup(HomepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HomepanelLayout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jLabel57))
                            .addGroup(HomepanelLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel56))
                            .addGroup(HomepanelLayout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jLabel43))
                            .addGroup(HomepanelLayout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addGroup(HomepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel58)
                                    .addComponent(jLabel59))))
                        .addGap(0, 79, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomepanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel60)))
                .addContainerGap())
        );
        HomepanelLayout.setVerticalGroup(
            HomepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomepanelLayout.createSequentialGroup()
                .addComponent(jLabel60)
                .addGap(5, 5, 5)
                .addComponent(jLabel58)
                .addGap(39, 39, 39)
                .addComponent(jLabel59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jLabel43)
                .addGap(30, 30, 30)
                .addComponent(jLabel56)
                .addGap(31, 31, 31)
                .addComponent(jLabel57)
                .addGap(64, 64, 64))
        );

        jPanel1.add(Homepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 470));

        menupanel1.setBackground(new java.awt.Color(102, 102, 102));

        addteacher1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-add-user-male-100.png"))); // NOI18N
        addteacher1.setText("Add Teacher");
        addteacher1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addteacher1MouseClicked(evt);
            }
        });

        coursesetting1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-course-100.png"))); // NOI18N
        coursesetting1.setText("Courses Setting");
        coursesetting1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coursesetting1MouseClicked(evt);
            }
        });

        rev1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-edit-100.png"))); // NOI18N
        rev1.setText("Remove, Edit and View Teachers");
        rev1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rev1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menupanel1Layout = new javax.swing.GroupLayout(menupanel1);
        menupanel1.setLayout(menupanel1Layout);
        menupanel1Layout.setHorizontalGroup(
            menupanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menupanel1Layout.createSequentialGroup()
                .addComponent(addteacher1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(coursesetting1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rev1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menupanel1Layout.setVerticalGroup(
            menupanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menupanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(addteacher1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(coursesetting1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(rev1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        featurepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        updateTeacher.setBackground(new java.awt.Color(53, 56, 57));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-form-30.png"))); // NOI18N
        jLabel12.setText("Fill The Form Correctly");

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Full Name");

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("CNIC");

        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Program");

        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Section");

        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Assign UserName");

        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Assign Password ");

        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });

        jTextField19.setEditable(false);
        jTextField19.setText("BS Computer Science");

        jButton7.setBackground(new java.awt.Color(102, 102, 102));
        jButton7.setText("Update");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTextField22.setEditable(false);
        jTextField22.setText("C");

        jButton8.setBackground(new java.awt.Color(102, 102, 102));
        jButton8.setText("Clear");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updateTeacherLayout = new javax.swing.GroupLayout(updateTeacher);
        updateTeacher.setLayout(updateTeacherLayout);
        updateTeacherLayout.setHorizontalGroup(
            updateTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateTeacherLayout.createSequentialGroup()
                .addGroup(updateTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(updateTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(updateTeacherLayout.createSequentialGroup()
                            .addGap(213, 213, 213)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(updateTeacherLayout.createSequentialGroup()
                            .addGap(260, 260, 260)
                            .addComponent(jLabel12)))
                    .addGroup(updateTeacherLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(updateTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addComponent(jLabel41)
                            .addComponent(jLabel40)
                            .addComponent(jLabel38)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(updateTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(updateTeacherLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jButton7)
                                .addGap(33, 33, 33)
                                .addComponent(jButton8))
                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        updateTeacherLayout.setVerticalGroup(
            updateTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateTeacherLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(updateTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(12, 12, 12)
                .addGroup(updateTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(17, 17, 17)
                .addGroup(updateTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addGap(11, 11, 11)
                .addGroup(updateTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateTeacherLayout.createSequentialGroup()
                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(updateTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(updateTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(updateTeacherLayout.createSequentialGroup()
                                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addGroup(updateTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton8)
                                    .addComponent(jButton7)))
                            .addComponent(jLabel42)))
                    .addComponent(jLabel40))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateTeacher, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateTeacher, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        featurepanel.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 370));

        addteacherpanel.setBackground(new java.awt.Color(0, 0, 255));

        jPanel3.setBackground(new java.awt.Color(53, 56, 57));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-form-30.png"))); // NOI18N
        jLabel1.setText("Fill The Form Correctly");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Full Name");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("CNIC");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Program");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Section");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Assign UserName");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Assign Password ");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setText("BS Computer Science");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("RollUp!!");
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.setRequestFocusEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField13.setEditable(false);
        jTextField13.setText("C");

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Clear");
        jButton4.setFocusPainted(false);
        jButton4.setRequestFocusEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jLabel1)
                        .addGap(79, 79, 79))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel13)
                            .addComponent(jLabel8)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(82, 82, 82)
                                .addComponent(jButton4))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                                .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                                .addComponent(jTextField13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)))))
                .addContainerGap(204, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout addteacherpanelLayout = new javax.swing.GroupLayout(addteacherpanel);
        addteacherpanel.setLayout(addteacherpanelLayout);
        addteacherpanelLayout.setHorizontalGroup(
            addteacherpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        addteacherpanelLayout.setVerticalGroup(
            addteacherpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        featurepanel.add(addteacherpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 370));

        courseteacherpanel.setBackground(new java.awt.Color(204, 0, 204));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-user-folder-30.png"))); // NOI18N
        jLabel18.setText("Registered Teachers");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-batch-assign-20.png"))); // NOI18N
        jButton3.setText("Assign Course");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(102, 102, 102));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-delete-key-20.png"))); // NOI18N
        jButton9.setText("Unassign Course");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addGap(49, 49, 49))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout courseteacherpanelLayout = new javax.swing.GroupLayout(courseteacherpanel);
        courseteacherpanel.setLayout(courseteacherpanelLayout);
        courseteacherpanelLayout.setHorizontalGroup(
            courseteacherpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        courseteacherpanelLayout.setVerticalGroup(
            courseteacherpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        featurepanel.add(courseteacherpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 370));

        edittecaherpanel.setBackground(new java.awt.Color(255, 51, 0));

        jPanel5.setBackground(new java.awt.Color(53, 56, 57));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-user-folder-30.png"))); // NOI18N
        jLabel21.setText("All Teachers Detail");

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Department", "Section", "CoursesAssigned"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable6.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(jTable6);

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-delete-key-20.png"))); // NOI18N
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(102, 102, 102));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-edit-20.png"))); // NOI18N
        jButton6.setText("Edit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addGap(20, 20, 20))
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton5)
                        .addComponent(jButton6))
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout edittecaherpanelLayout = new javax.swing.GroupLayout(edittecaherpanel);
        edittecaherpanel.setLayout(edittecaherpanelLayout);
        edittecaherpanelLayout.setHorizontalGroup(
            edittecaherpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        edittecaherpanelLayout.setVerticalGroup(
            edittecaherpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        featurepanel.add(edittecaherpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 370));

        updateTeacher1.setBackground(new java.awt.Color(53, 56, 57));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-course-assign-24.png"))); // NOI18N
        jLabel19.setText("Aassign a Course");

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Full Name");

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("CNIC");

        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Program");

        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Section");

        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Assign UserName");

        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Assign Password ");

        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });

        jTextField24.setEditable(false);
        jTextField24.setText("BS Computer Science");

        jButton10.setText("Assign");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jTextField27.setEditable(false);
        jTextField27.setText("C");

        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Assign Course");

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton11.setText("Go Back");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updateTeacher1Layout = new javax.swing.GroupLayout(updateTeacher1);
        updateTeacher1.setLayout(updateTeacher1Layout);
        updateTeacher1Layout.setHorizontalGroup(
            updateTeacher1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateTeacher1Layout.createSequentialGroup()
                .addGroup(updateTeacher1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(updateTeacher1Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(updateTeacher1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(updateTeacher1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47)
                            .addComponent(jLabel46)
                            .addComponent(jLabel45)
                            .addComponent(jLabel44)
                            .addComponent(jLabel34)
                            .addComponent(jLabel33)
                            .addComponent(jLabel48))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(updateTeacher1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(updateTeacher1Layout.createSequentialGroup()
                                .addComponent(jButton10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton11))
                            .addComponent(jTextField26, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                            .addComponent(jTextField25, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                            .addComponent(jTextField27, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                            .addComponent(jTextField24, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                            .addComponent(jTextField23, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                            .addComponent(jTextField12))))
                .addGap(18, 18, 18)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateTeacher1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223))
        );
        updateTeacher1Layout.setVerticalGroup(
            updateTeacher1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateTeacher1Layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updateTeacher1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addGap(12, 12, 12)
                .addGroup(updateTeacher1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addGap(17, 17, 17)
                .addGroup(updateTeacher1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addGap(11, 11, 11)
                .addGroup(updateTeacher1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateTeacher1Layout.createSequentialGroup()
                        .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(updateTeacher1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(updateTeacher1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(updateTeacher1Layout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel48))
                            .addGroup(updateTeacher1Layout.createSequentialGroup()
                                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addGroup(updateTeacher1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(updateTeacher1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton10)
                                    .addComponent(jButton11)))))
                    .addComponent(jLabel45))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout AssignCourseLayout = new javax.swing.GroupLayout(AssignCourse);
        AssignCourse.setLayout(AssignCourseLayout);
        AssignCourseLayout.setHorizontalGroup(
            AssignCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateTeacher1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AssignCourseLayout.setVerticalGroup(
            AssignCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateTeacher1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        featurepanel.add(AssignCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 370));

        updateTeacher2.setBackground(new java.awt.Color(53, 56, 57));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-course-assign-24.png"))); // NOI18N
        jLabel20.setText("Unassign The Course");

        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Full Name");

        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("CNIC");

        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Program");

        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Section");

        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Assign UserName");

        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Assign Password ");

        jTextField28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField28ActionPerformed(evt);
            }
        });

        jTextField30.setEditable(false);
        jTextField30.setText("BS Computer Science");

        jButton12.setText("Unassign");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jTextField33.setEditable(false);
        jTextField33.setText("C");

        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Assign Course");

        jButton13.setText("Go Back");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updateTeacher2Layout = new javax.swing.GroupLayout(updateTeacher2);
        updateTeacher2.setLayout(updateTeacher2Layout);
        updateTeacher2Layout.setHorizontalGroup(
            updateTeacher2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateTeacher2Layout.createSequentialGroup()
                .addGroup(updateTeacher2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(updateTeacher2Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(updateTeacher2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(updateTeacher2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel53)
                            .addComponent(jLabel52)
                            .addComponent(jLabel51)
                            .addComponent(jLabel50)
                            .addComponent(jLabel49)
                            .addComponent(jLabel35)
                            .addComponent(jLabel54))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(updateTeacher2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(updateTeacher2Layout.createSequentialGroup()
                                .addComponent(jButton12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton13))
                            .addComponent(jTextField32, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                            .addComponent(jTextField31, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                            .addComponent(jTextField33, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                            .addComponent(jTextField30, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                            .addComponent(jTextField29, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                            .addComponent(jTextField14))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateTeacher2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223))
        );
        updateTeacher2Layout.setVerticalGroup(
            updateTeacher2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateTeacher2Layout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updateTeacher2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addGap(12, 12, 12)
                .addGroup(updateTeacher2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49))
                .addGap(17, 17, 17)
                .addGroup(updateTeacher2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50))
                .addGap(11, 11, 11)
                .addGroup(updateTeacher2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateTeacher2Layout.createSequentialGroup()
                        .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(updateTeacher2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(updateTeacher2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(updateTeacher2Layout.createSequentialGroup()
                                .addComponent(jLabel53)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel54))
                            .addGroup(updateTeacher2Layout.createSequentialGroup()
                                .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addGroup(updateTeacher2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(updateTeacher2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton12)
                                    .addComponent(jButton13)))))
                    .addComponent(jLabel51))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        featurepanel.add(updateTeacher2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout teacherpanelLayout = new javax.swing.GroupLayout(teacherpanel);
        teacherpanel.setLayout(teacherpanelLayout);
        teacherpanelLayout.setHorizontalGroup(
            teacherpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(featurepanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menupanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        teacherpanelLayout.setVerticalGroup(
            teacherpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacherpanelLayout.createSequentialGroup()
                .addComponent(menupanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(featurepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(teacherpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, -1));

        menupanel2.setBackground(new java.awt.Color(102, 102, 102));

        addteacher2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-add-user-male-100.png"))); // NOI18N
        addteacher2.setText("Add Student");
        addteacher2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addteacher2MouseClicked(evt);
            }
        });

        rev2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-edit-100.png"))); // NOI18N
        rev2.setText("Remove, Edit and View Student");
        rev2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rev2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menupanel2Layout = new javax.swing.GroupLayout(menupanel2);
        menupanel2.setLayout(menupanel2Layout);
        menupanel2Layout.setHorizontalGroup(
            menupanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menupanel2Layout.createSequentialGroup()
                .addComponent(addteacher2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rev2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menupanel2Layout.setVerticalGroup(
            menupanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menupanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(addteacher2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(rev2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addstudetnpanel.setBackground(new java.awt.Color(255, 153, 0));

        jPanel7.setBackground(new java.awt.Color(53, 56, 57));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-form-30.png"))); // NOI18N
        jLabel7.setText("Fill The Form Correctly");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Full Name");

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Reg.No.");

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Program");

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Section");

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Assign ID");

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Assign Password ");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField8.setEditable(false);
        jTextField8.setText("BS Computer Science");

        jTextField9.setEditable(false);
        jTextField9.setText("C");

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setText("RollUp!!");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel24)
                    .addComponent(jLabel9)
                    .addComponent(jLabel28)
                    .addComponent(jLabel27)
                    .addComponent(jLabel26))
                .addGap(18, 39, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField10)
                    .addComponent(jTextField9)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(197, 197, 197))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jLabel7))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout addstudetnpanelLayout = new javax.swing.GroupLayout(addstudetnpanel);
        addstudetnpanel.setLayout(addstudetnpanelLayout);
        addstudetnpanelLayout.setHorizontalGroup(
            addstudetnpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addstudetnpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        addstudetnpanelLayout.setVerticalGroup(
            addstudetnpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addstudetnpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.add(addstudetnpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 370));

        editstudentpanel.setBackground(new java.awt.Color(153, 102, 0));

        jPanel8.setBackground(new java.awt.Color(53, 56, 57));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-user-folder-30.png"))); // NOI18N
        jLabel29.setText("All Students Detail");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jButton14.setBackground(new java.awt.Color(102, 102, 102));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-edit-20.png"))); // NOI18N
        jButton14.setText("Edit");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(102, 102, 102));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-delete-key-20.png"))); // NOI18N
        jButton15.setText("Delete");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton14)
                .addGap(28, 28, 28)
                .addComponent(jButton15)
                .addGap(38, 38, 38))
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton14)
                        .addComponent(jButton15))
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout editstudentpanelLayout = new javax.swing.GroupLayout(editstudentpanel);
        editstudentpanel.setLayout(editstudentpanelLayout);
        editstudentpanelLayout.setHorizontalGroup(
            editstudentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editstudentpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        editstudentpanelLayout.setVerticalGroup(
            editstudentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editstudentpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.add(editstudentpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 370));

        editstudentpanellllll.setBackground(new java.awt.Color(53, 56, 57));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-form-30.png"))); // NOI18N
        jLabel10.setText("Fill The Form Correctly");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Full Name");

        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Reg.No.");

        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Program");

        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Section");

        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Assign ID");

        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Assign Password ");

        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        jTextField35.setEditable(false);
        jTextField35.setText("BS Computer Science");

        jTextField36.setEditable(false);
        jTextField36.setText("C");

        jButton16.setBackground(new java.awt.Color(102, 102, 102));
        jButton16.setText("Upadte");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editstudentpanellllllLayout = new javax.swing.GroupLayout(editstudentpanellllll);
        editstudentpanellllll.setLayout(editstudentpanellllllLayout);
        editstudentpanellllllLayout.setHorizontalGroup(
            editstudentpanellllllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editstudentpanellllllLayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(editstudentpanellllllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(jLabel30)
                    .addComponent(jLabel11)
                    .addComponent(jLabel55)
                    .addComponent(jLabel37)
                    .addComponent(jLabel36))
                .addGap(18, 39, Short.MAX_VALUE)
                .addGroup(editstudentpanellllllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField37)
                    .addComponent(jTextField36)
                    .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(197, 197, 197))
            .addGroup(editstudentpanellllllLayout.createSequentialGroup()
                .addGroup(editstudentpanellllllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editstudentpanellllllLayout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jLabel10))
                    .addGroup(editstudentpanellllllLayout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jButton16)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        editstudentpanellllllLayout.setVerticalGroup(
            editstudentpanellllllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editstudentpanellllllLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(editstudentpanellllllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(editstudentpanellllllLayout.createSequentialGroup()
                        .addGroup(editstudentpanellllllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel30)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editstudentpanellllllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editstudentpanellllllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addGap(18, 18, 18)
                .addGroup(editstudentpanellllllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addGap(18, 18, 18)
                .addGroup(editstudentpanellllllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55))
                .addGap(18, 18, 18)
                .addComponent(jButton16)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel6.add(editstudentpanellllll, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout studentpanelLayout = new javax.swing.GroupLayout(studentpanel);
        studentpanel.setLayout(studentpanelLayout);
        studentpanelLayout.setHorizontalGroup(
            studentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menupanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        studentpanelLayout.setVerticalGroup(
            studentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentpanelLayout.createSequentialGroup()
                .addComponent(menupanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(studentpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 470));

        menupanel3.setBackground(new java.awt.Color(102, 102, 102));

        coursesetting2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-course-100.png"))); // NOI18N
        coursesetting2.setText(" Courses");
        coursesetting2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coursesetting2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menupanel3Layout = new javax.swing.GroupLayout(menupanel3);
        menupanel3.setLayout(menupanel3Layout);
        menupanel3Layout.setHorizontalGroup(
            menupanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(coursesetting2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menupanel3Layout.setVerticalGroup(
            menupanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(coursesetting2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editcoursespanel.setBackground(new java.awt.Color(102, 0, 255));

        jPanel10.setBackground(new java.awt.Color(53, 56, 57));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-user-folder-30.png"))); // NOI18N
        jLabel32.setText("All Courses Detail");

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable5);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 487, Short.MAX_VALUE))
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout editcoursespanelLayout = new javax.swing.GroupLayout(editcoursespanel);
        editcoursespanel.setLayout(editcoursespanelLayout);
        editcoursespanelLayout.setHorizontalGroup(
            editcoursespanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        editcoursespanelLayout.setVerticalGroup(
            editcoursespanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(editcoursespanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 370));

        javax.swing.GroupLayout coursepanelLayout = new javax.swing.GroupLayout(coursepanel);
        coursepanel.setLayout(coursepanelLayout);
        coursepanelLayout.setHorizontalGroup(
            coursepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menupanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        coursepanelLayout.setVerticalGroup(
            coursepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursepanelLayout.createSequentialGroup()
                .addComponent(menupanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(coursepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 470));

        jPanel9.setBackground(new java.awt.Color(0, 0, 153));

        jButton17.setBackground(new java.awt.Color(0, 0, 153));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cross.png"))); // NOI18N
        jButton17.setBorder(null);
        jButton17.setBorderPainted(false);
        jButton17.setFocusPainted(false);
        jButton17.setFocusable(false);
        jButton17.setRequestFocusEnabled(false);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(0, 0, 153));
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-save-close-20.png"))); // NOI18N
        jButton18.setText("Save");
        jButton18.setBorder(null);
        jButton18.setBorderPainted(false);
        jButton18.setFocusPainted(false);
        jButton18.setOpaque(true);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 783, Short.MAX_VALUE)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
            .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MenuTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MenuTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 463, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menustarterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menustarterMouseClicked
        // TODO add your handling code here:
//        setmanageteacherfalse();
        Homepanel.setVisible(true);
        teacherpanel.setVisible(false);
        studentpanel.setVisible(false);
        coursepanel.setVisible(false);
    }//GEN-LAST:event_menustarterMouseClicked

    private void hometabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hometabMouseClicked
        // TODO add your handling code here:

        Homepanel.setVisible(false);
        courseteacherpanel.setVisible(false);
        teacherpanel.setVisible(true);
        studentpanel.setVisible(false);
        coursepanel.setVisible(false);
        updateTeacher.setVisible(false);
    }//GEN-LAST:event_hometabMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        Homepanel.setVisible(false);
        teacherpanel.setVisible(false);
        edittecaherpanel.setVisible(false);
        studentpanel.setVisible(true);
        coursepanel.setVisible(false);
        editstudentpanel.setVisible(false);
        addteacherpanel.setVisible(true);


    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        Homepanel.setVisible(false);
        teacherpanel.setVisible(false);
        studentpanel.setVisible(false);
        coursepanel.setVisible(true);
        showCourseTable();


    }//GEN-LAST:event_jLabel4MouseClicked

    private void addteacher1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addteacher1MouseClicked
        // TODO add your handling code here:
        addteacherpanel.setVisible(true);
        courseteacherpanel.setVisible(false);
        edittecaherpanel.setVisible(false);
        updateTeacher.setVisible(false);


    }//GEN-LAST:event_addteacher1MouseClicked

    private void coursesetting1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coursesetting1MouseClicked
        // TODO add your handling code here:
        addteacherpanel.setVisible(false);
        courseteacherpanel.setVisible(true);
        edittecaherpanel.setVisible(false);
        updateTeacher.setVisible(false);
        showTableTeacher(jTable2);

    }//GEN-LAST:event_coursesetting1MouseClicked

    private void rev1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rev1MouseClicked
        // TODO add your handling code here:
        addteacherpanel.setVisible(false);
        courseteacherpanel.setVisible(false);
        edittecaherpanel.setVisible(true);
        updateTeacher.setVisible(false);
        showTableTeacher(jTable6);
    }//GEN-LAST:event_rev1MouseClicked

    private void addteacher2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addteacher2MouseClicked
        // TODO add your handling code here:
        addstudetnpanel.setVisible(true);
        editstudentpanel.setVisible(false);
    }//GEN-LAST:event_addteacher2MouseClicked

    private void rev2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rev2MouseClicked
        // TODO add your handling code here:
        addstudetnpanel.setVisible(false);
        editstudentpanel.setVisible(true);
    }//GEN-LAST:event_rev2MouseClicked

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void coursesetting2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coursesetting2MouseClicked
        // TODO add your handling code here:
        editcoursespanel.setVisible(true);
    }//GEN-LAST:event_coursesetting2MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        this.setVisible(false);
        Login_Screen obj = new Login_Screen();
        obj.setVisible(true);
        Administrator.getinstace().saveStudent();


    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int l = jTable6.getSelectedRowCount();
        if (l > 0) {
            int row = jTable6.getSelectedRow();

            String g = (String) jTable6.getValueAt(jTable6.getSelectedRow(), 3);
            for (int i = 0; i < Administrator.getinstace().teacherlist.size(); i++) {
                if (g.equals(Administrator.getinstace().teacherlist.get(i).getmail())) {
                    System.out.println(i);
                    model.removeRow(row);
                    List<String> list = Administrator.getinstace().teacherlist.get(i).listcoursename;
                    for (int k = 0; k < Administrator.getinstace().course.size(); k++) {
                        for (int p = 0; p < list.size(); p++) {
                            if (list.get(p).equals(Administrator.getinstace().course.get(i).getcourseTitle())) {
                                Administrator.getinstace().course.get(i).setTeacherName("null");
                            }
                        }
                    }
                    Administrator.getinstace().teacherlist.remove(i);

                }
            }
        } else {

        }
        showTableTeacher(jTable6);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int l = jTable6.getSelectedRowCount();
        System.out.println(l);
        if (l > 0) {
            jPanel11.setVisible(true);
            int row = jTable6.getSelectedRow();
            System.out.println(row);
            String g = (String) jTable6.getValueAt(jTable6.getSelectedRow(), 3);
            for (int i = 0; i < Administrator.getinstace().teacherlist.size(); i++) {
                if (g.equals(Administrator.getinstace().teacherlist.get(i).getmail())) {
                    if (row >= 0) {
                        updateTeacher.setVisible(true);
                        edittecaherpanel.setVisible(false);
                        addteacherpanel.setVisible(false);
                        courseteacherpanel.setVisible(false);
                        jTextField16.setText(Administrator.getinstace().teacherlist.get(i).getname());
                        jTextField18.setText(Administrator.getinstace().teacherlist.get(i).getcnic());
                        jTextField20.setText(Administrator.getinstace().teacherlist.get(i).getmail());
                        jTextField21.setText(Administrator.getinstace().teacherlist.get(i).getpass());

                    }
                }
            }
        } else {

        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        int row = jTable6.getSelectedRow();
        String g = (String) jTable6.getValueAt(jTable6.getSelectedRow(), 3);
        for (int i = 0; i < Administrator.getinstace().teacherlist.size(); i++) {
            if (g.equals(Administrator.getinstace().teacherlist.get(i).getmail())) {
                if (row >= 0) {
                    String name = jTextField16.getText();
                    String cnic = jTextField18.getText();
                    String mail = jTextField20.getText();
                    String pass = jTextField21.getText();
                    Administrator.getinstace().teacherlist.get(i).setname(name);
                    Administrator.getinstace().teacherlist.get(i).setcnic(cnic);
                    Administrator.getinstace().teacherlist.get(i).setmail(mail);
                    Administrator.getinstace().teacherlist.get(i).setpass(pass);
                    model.setValueAt(Administrator.getinstace().teacherlist.get(i).getname(), row, 0);
                    model.setValueAt("Computer Science", row, 1);
                    model.setValueAt("C", row, 2);
                    model.setValueAt(Administrator.getinstace().teacherlist.get(i).getmail(), row, 3);
                    String course = "";
                    for (int j = 0; j < Administrator.getinstace().teacherlist.get(i).courselist.size(); j++) {
                        course = course + Administrator.getinstace().teacherlist.get(i).courselist.get(j).getcourseTitle();
                    }
                    model.setValueAt(course, row, 4);
                    edittecaherpanel.setVisible(true);
                    updateTeacher.setVisible(false);
                    break;
                }
            }
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        boolean flag = false;

        int row = jTable2.getSelectedRow();
        if (row >= 0) {
            String course = jComboBox2.getItemAt(jComboBox2.getSelectedIndex());
            String g = (String) jTable2.getValueAt(jTable2.getSelectedRow(), 3);
            String name = (String) jTable2.getValueAt(jTable2.getSelectedRow(), 0);
            for (int i = 0; i < Administrator.getinstace().teacherlist.size(); i++) {
                if (g.equals(Administrator.getinstace().teacherlist.get(i).getmail())) {
                    for (int j = 0; j < Administrator.getinstace().course.size(); j++) {
                        if (course.equals(Administrator.getinstace().course.get(j).getcourseTitle())) {
                            Administrator.getinstace().teacherlist.get(i).listcoursename.add(course);
                            Administrator.getinstace().course.get(j).setTeacherName(name);
                            showTableTeacher(jTable2);
                            updateTeacher2.setVisible(false);
                            courseteacherpanel.setVisible(true);
                            updateTeacher1.setVisible(false);

                            //JOptionPane.showMessageDialog(null, "Course Added SuccessFully!!");
                        }

                    }
                }

            }

        }


    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int l = jTable2.getSelectedRowCount();
        System.out.println(l);
        if (l > 0) {
            AssignCourse.setVisible(true);
            updateTeacher1.setVisible(true);
            this.jComboBox2.removeAllItems();
            int row = jTable2.getSelectedRow();
            String g = (String) jTable2.getValueAt(jTable2.getSelectedRow(), 3);
            if (row >= 0) {
                edittecaherpanel.setVisible(false);
                addteacherpanel.setVisible(false);
                courseteacherpanel.setVisible(false);
                jTextField17.setText(Administrator.getinstace().teacherlist.get(row).getname());
                jTextField23.setText(Administrator.getinstace().teacherlist.get(row).getcnic());
                jTextField25.setText(Administrator.getinstace().teacherlist.get(row).getmail());
                jTextField26.setText(Administrator.getinstace().teacherlist.get(row).getpass());
                String course = "";
                for (int j = 0; j < Administrator.getinstace().teacherlist.get(row).courselist.size(); j++) {
                    if (j == Administrator.getinstace().teacherlist.get(row).courselist.size() - 1) {
                        course = course + Administrator.getinstace().teacherlist.get(row).courselist.get(j).getcourseTitle();
                    } else {
                        course = course + Administrator.getinstace().teacherlist.get(row).courselist.get(j).getcourseTitle() + ",";
                    }
                }
                jButton11.setVisible(true);
                jTextField12.setText(course);
                jTextField17.setEditable(false);
                jTextField23.setEditable(false);
                jTextField25.setEditable(false);
                jTextField26.setEditable(false);
                jTextField12.setEditable(false);
                Administrator.getinstace().availabeleassign(jComboBox2);
                String[] arr = course.split(",");

//                for (int k = 0; k < jComboBox1.getItemCount(); k++) {
//                    boolean flag = true;
//                    String allcombo = jComboBox1.getItemAt(k);
//
//                    for (int o = 0; o < arr.length; o++) {
//
//                        if (allcombo.equals(arr[o])) {
//
//                            flag = false;
//                        }
//
//                    }
//                    if (flag == true) {
//                        jComboBox2.addItem(allcombo);
//                    }
//                }
//
//                if (jComboBox2.getItemCount() == 0) {
//                    jButton10.setVisible(false);
//
//                    jComboBox2.setVisible(false);
//
//                }
            }
            updateTeacher1.setVisible(true);
        } else {

        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        courseteacherpanel.setVisible(true);
        updateTeacher2.setVisible(false);
        updateTeacher1.setVisible(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        int l = jTable2.getSelectedRowCount();
        if (l > 0) {
            jComboBox3.setVisible(true);
            jButton12.setVisible(true);
            updateTeacher2.setVisible(true);
            this.jComboBox3.removeAllItems();
            int row = jTable2.getSelectedRow();
            String g = (String) jTable2.getValueAt(jTable2.getSelectedRow(), 3);

            if (row >= 0) {

                edittecaherpanel.setVisible(false);
                addteacherpanel.setVisible(false);
                courseteacherpanel.setVisible(false);
                jTextField28.setText(Administrator.getinstace().teacherlist.get(row).getname());
                jTextField29.setText(Administrator.getinstace().teacherlist.get(row).getcnic());
                jTextField31.setText(Administrator.getinstace().teacherlist.get(row).getmail());
                jTextField32.setText(Administrator.getinstace().teacherlist.get(row).getpass());
                String course = "";
                for (int j = 0; j < Administrator.getinstace().teacherlist.get(row).listcoursename.size(); j++) {
                    if (j == Administrator.getinstace().teacherlist.get(row).listcoursename.size() - 1) {
                        course = course + Administrator.getinstace().teacherlist.get(row).listcoursename.get(j);
                    } else {
                        course = course + Administrator.getinstace().teacherlist.get(row).listcoursename.get(j) + ",";
                    }
                }
                jTextField14.setText(course);
                jTextField28.setEditable(false);
                jTextField29.setEditable(false);
                jTextField31.setEditable(false);
                jTextField32.setEditable(false);
                jTextField14.setEditable(false);
                String[] arr = course.split(",");

                for (int k = 0; k < arr.length; k++) {
                    jComboBox3.addItem(arr[k]);
                }
                if (jComboBox3.getItemCount() == 0) {
//                jButton10.setVisible(false);
//                jButton11.setVisible(true);
//                jComboBox2.setVisible(false);

                }
            }

        } else {

        }

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField28ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        int k = jTable4.getSelectedRowCount();
        if (k >= 0) {
            int row = jTable2.getSelectedRow();
            //  row = row + 1;
            System.out.println(row);
            String coursecobo = jComboBox3.getItemAt(jComboBox3.getSelectedIndex());
            String g = (String) jTable2.getValueAt(jTable2.getSelectedRow(), 3);
            for (int i = 0; i < Administrator.getinstace().teacherlist.size(); i++) {
                if (g.equals(Administrator.getinstace().teacherlist.get(i).getmail())) {
                    if (row >= 0) {
                        for (int j = 0; j < Administrator.getinstace().teacherlist.get(i).listcoursename.size(); j++) {
                            if (coursecobo.equals(Administrator.getinstace().teacherlist.get(i).listcoursename.get(j))) {
                                Administrator.getinstace().teacherlist.get(i).listcoursename.remove(j);
                                for (int p = 0; p < Administrator.getinstace().course.size(); p++) {
                                    if (coursecobo.equals(Administrator.getinstace().course.get(p).getcourseTitle())) {
                                        Administrator.getinstace().course.get(p).setTeacherName("null");
                                    }
                                }
                                // System.out.println(Administrator.getinstace().course.size());
                            }
                        }
                    }
                }
            }
            showTableTeacher(jTable2);
            updateTeacher2.setVisible(false);
            courseteacherpanel.setVisible(true);
        } else {

        }


    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        courseteacherpanel.setVisible(true);
        updateTeacher2.setVisible(false);
        updateTeacher1.setVisible(false);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String name = jTextField4.getText();
        String reg = jTextField7.getText();
        String id = jTextField11.getText();
        String pass = jTextField10.getText();
       if( StudentaddValidate(name, reg, id))
        {
            Student objstd = new Student();
            objstd.setName(name);
            objstd.setregNo(reg);
            objstd.setID(id);
            objstd.setpass(pass);
            if (Administrator.getinstace().addStudent(objstd)) {
                System.out.println("Addedd");
            }
            studenttable(jTable4);
            addstudetnpanel.setVisible(false);
            editstudentpanel.setVisible(true);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        int i = jTable4.getSelectedRowCount();
        if (i > 0) {
            int row = jTable4.getSelectedRow();
            String id = (String) jTable4.getValueAt(row, 4);
            if (Administrator.getinstace().delstudent(id)) {
                System.out.println("del");
                studenttable(jTable4);
            }
        } else {

        }

    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        int i = jTable4.getSelectedRowCount();
        if (i > 0) {
            int row = jTable4.getSelectedRow();
            editstudentpanel.setVisible(false);
            editstudentpanellllll.setVisible(true);
            jTextField15.setText(Administrator.getinstace().stdlist.get(row).getName());
            jTextField34.setText(Administrator.getinstace().stdlist.get(row).getregNo());
            jTextField38.setText(Administrator.getinstace().stdlist.get(row).getID());
            jTextField37.setText(Administrator.getinstace().stdlist.get(row).getpass());

        } else {

        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        int row = jTable4.getSelectedRow();
        String name = jTextField15.getText();
        String reg = jTextField34.getText();
        String id = jTextField38.getText();
        String pass = jTextField37.getText();
        if (Administrator.getinstace().editstudent(name, reg, id, pass, row)) {
            System.out.println("edited");
            studenttable(jTable4);
            editstudentpanel.setVisible(true);
            editstudentpanellllll.setVisible(false);
        }

    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        Administrator.getinstace().saveAssessment();
        Administrator.getinstace().saveStudent();
        Administrator.getinstace().saveCourses();
        Administrator.getinstace().saveTeacher();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        Teacher obj = new Teacher();
        String name = jTextField1.getText();
        String cnic = jTextField2.getText();
        String mail = jTextField5.getText();
        String pass = jTextField6.getText();

        if (TeacheraddValidate(name, cnic, mail)) {
            obj.setname(name);
            obj.setcnic(cnic);
            obj.setmail(mail);
            obj.setpass(pass);
            if (Administrator.getinstace().addteacher(obj)) {
                edittecaherpanel.setVisible(true);
                addteacherpanel.setVisible(false);
                showTableTeacher(jTable6);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    private void setmanageteacherfalse() {
//        addtpanel.setVisible(false);
//        cpanel.setVisible(false);
//        epanel.setVisible(false);
        // editpanel.setVisible(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AssignCourse;
    private javax.swing.JPanel Homepanel;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JPanel MenuTab;
    private javax.swing.JPanel addstudetnpanel;
    private javax.swing.JLabel addteacher1;
    private javax.swing.JLabel addteacher2;
    private javax.swing.JPanel addteacherpanel;
    private javax.swing.JPanel coursepanel;
    private javax.swing.JLabel coursesetting1;
    private javax.swing.JLabel coursesetting2;
    private javax.swing.JPanel courseteacherpanel;
    private javax.swing.JPanel editcoursespanel;
    private javax.swing.JPanel editstudentpanel;
    private javax.swing.JPanel editstudentpanellllll;
    private javax.swing.JPanel edittecaherpanel;
    private javax.swing.JPanel featurepanel;
    private javax.swing.JLabel hometab;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel menupanel1;
    private javax.swing.JPanel menupanel2;
    private javax.swing.JPanel menupanel3;
    private javax.swing.JLabel menustarter;
    private javax.swing.JLabel profile_Picture;
    private javax.swing.JLabel rev1;
    private javax.swing.JLabel rev2;
    private javax.swing.JPanel studentpanel;
    private javax.swing.JPanel teacherpanel;
    private javax.swing.JPanel updateTeacher;
    private javax.swing.JPanel updateTeacher1;
    private javax.swing.JPanel updateTeacher2;
    // End of variables declaration//GEN-END:variables
}
