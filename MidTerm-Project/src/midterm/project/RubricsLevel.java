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
public class RubricsLevel {
    private String levelName;
    private int order;
    private int percentage;
    
    public void setlevelname(String n)
    {
        levelName=n;
    }
     public void setorder(int n)
    {
        order=n;
    }
      public void setpercentage(int n)
    {
        percentage=n;
    }
       public String getlevelname()
    {
        return levelName;
    }
     public int gettorder()
    {
       return order;
    }
      public int getpercentage()
    {
        return percentage;
    }
}
