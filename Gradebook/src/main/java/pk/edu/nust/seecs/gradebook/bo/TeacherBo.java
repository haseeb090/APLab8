/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.edu.nust.seecs.gradebook.bo;

import java.util.ArrayList;
import javax.swing.JTextArea;

/**
 *
 * @author mfarhan.bscs13seecs
 */
public interface TeacherBo {
     public void sayHello(Integer teacherId);

    public String getInfo();

    public void printCourses(JTextArea outputText);
    
    public Integer addTeachers(String teacherName, ArrayList<Integer> teacherCourses);
}
