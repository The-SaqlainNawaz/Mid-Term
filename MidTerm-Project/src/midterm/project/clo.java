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
public class clo 
{
    private int clonumber;
    List<Rubrics>rubricslist=new ArrayList<>();
    
    
    public int getclonumber()
    {
        return clonumber;
    }
     public void setclonumber(int a)
    {
       clonumber=a;
    }
     public boolean validNumbers(String b)
     {
         boolean flag=false;
         for(int i=0;i<b.length();i++)
         {
             if(b.charAt(i)>='0' &&b.charAt(i)<='9')
             {
                 flag=true;
             }
             else
             {
                 return false;
             }
         }
         return flag;
     }
}
