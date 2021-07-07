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
public class Rubrics 
{
    private String rubricsNAme;
    List<RubricsLevel>levellist=new ArrayList<>();
    
    public void setrubricsName(String i)
    {
        rubricsNAme=i;
    }
     public String getrubricsName()
    {
        return rubricsNAme;
    }
}
