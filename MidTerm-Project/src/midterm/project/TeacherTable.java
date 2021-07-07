/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm.project;

import java.util.*;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Proud To Be Muslims
 */
public class TeacherTable extends AbstractTableModel {

    private List<String> li = new ArrayList<>();
    private String[] columnNames = {"Name", "Department", "Section", "CoursesAssigned", "Edit", "Delete"};

    public TeacherTable(List<Teacher> list) {
//        List<String> rows = new ArrayList<>();
//        String []arr=new String[4];
//        for (int i = 0; i < list.size(); i++) {
//          
//            arr[0]=(list.get(0).getname());
//             arr[1]=("Computer Science");
//             arr[2]=("C");
//             arr[3]= "";
//            for (int j = 0; j < list.get(i).courselist.size(); j++) {
//                arr[3] = arr[3] + list.get(0).courselist.get(j).getcourseTitle();
//            }
//            rows.add(arr);
//        }
//         for(int i=0;i<list.size();i++)
//         {
//             
//         }
//        this.li =rows;
    }
 
    @Override
    public String getColumnName(int columnIndex){
         return columnNames[columnIndex];
    }
    
  

    @Override     
    public int getRowCount() {
        return li.size();
    }

    @Override        
    public int getColumnCount() {
        return columnNames.length; 
    }

    
    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
//        li = li.get(rowIndex);
//        switch (columnIndex) {
//            case 0: 
//                return si.getName();
//            case 1:
//                return si.getEmail();
//            case 2:
//                return si.getContactNumber();
//            case 3:
//                return si.getDob();
//            case 4:
//                return "Edit";
//            case 5:
//                
//                 
//                        return "Delete";
//            
//           }
//           return null;
   }

   @Override
   public Class<?> getColumnClass(int columnIndex){
       System.out.println("column index = " + columnIndex);
          switch (columnIndex){
             case 0:
               return String.class;
             case 1:
               return String.class;
             case 2:
               return String.class;
             case 3:
               return Date.class;
             case 4: 
               return String.class;
                case 5: 
               return String.class;
             }
             return null;
      }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
      
        return columnIndex == 4 || columnIndex==5;
    }
   
    
//    public void editRow(int row){
//     String contact = (String)getValueAt(row, 2);
//     AddContactPanel p = new AddContactPanel(contact, "Edit");
//     MainForm.getInstance().goToPage(p);
//                
//    }
//    
//    
//      
//    public void deleteRow(int row){
//     String contact = (String)getValueAt(row, 2);
//     AddContactPanel p = new AddContactPanel(contact,  "Delete");
//     MainForm.getInstance().goToPage(p);
//                
//    }

    
}
