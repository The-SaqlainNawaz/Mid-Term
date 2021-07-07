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
public class Student {
    private String Name;
    private String regNo;
    private String ID;
    private String pass;
    List<String>teacher=new ArrayList<>();
    
    public boolean validid(String b)
    {
         boolean flag = false;
        int size = b.length();
        if (b.charAt(0) =='S' && b.charAt(1)=='T' && b.charAt(2) == '-') {
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
    
    public boolean validregNo(String b)
    {
        boolean flag=false;
        
            if(b.charAt(0)=='2'&& b.charAt(1)=='0' && b.charAt(2)=='2' && b.charAt(3)=='0' && b.charAt(4)=='-' && b.charAt(5)=='C' && b.charAt(6)=='S'&& b.charAt(7)=='-')
            {
                for(int i=8;i<b.length();i++)
                {
                    if(b.charAt(i)>='0' && b.charAt(0)<='9')
                    {
                        flag=true;
                    }
                    else
                    {
                        return false;
                    }
                }
            }
        return flag;
    }
    public void setName(String a)
    {
        Name=a;
    }
    public void setregNo(String a)
    {
        regNo=a;
    }
    public void setID(String a)
    {
        ID=a;
    }
    public void setpass(String a)
    {
        pass=a;
    }
    public String getName()
    {
        return Name;
    }
    public String getregNo()
    {
        return regNo;
    }
    public String getID()
    {
        return ID;
    }
    public String getpass()
    {
        return pass;
    }
    
}
