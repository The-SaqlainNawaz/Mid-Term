/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm.project;

/**
 *
 * @author Proud To Be Muslims
 */
public class assessQuestions {
    private int question;
    private int componentmarks;
    private String rubricsname;
    
    
     public void setquestion(int a)
    {
        question=a;
    }
     public void setcomponentmarks(int a)
    {
        componentmarks=a;
    }
      public void setrubricsname(String a)
    {
        rubricsname=a;
    }
     
       public String getrubricsname()
    {
        return rubricsname;
    }
     public int getcomponentmarks()
    {
        return componentmarks;
    }
      public int getquestion()
    {
        return question;
    }
    
    
}
