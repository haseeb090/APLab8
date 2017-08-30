
package pk.edu.nust.seecs.gradebook.bo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import org.springframework.beans.factory.annotation.Autowired;
import pk.edu.nust.seecs.gradebook.dao.StudentDao;
import pk.edu.nust.seecs.gradebook.dao.TeacherDao;
import pk.edu.nust.seecs.gradebook.entity.Course;
import pk.edu.nust.seecs.gradebook.entity.Student;
import pk.edu.nust.seecs.gradebook.entity.Teacher;

public class TeacherBoImpl implements TeacherBo{

    @Autowired
    TeacherDao teacherPersistor;
    
    Teacher teacherActor;
    
    @Override
    public void sayHello(Integer teacherId) {
        teacherActor = teacherPersistor.getTeacherById(teacherId);
    }

    @Override
    public String getInfo() {
        return teacherActor.toString();
    }

    @Override
    public void printCourses(JTextArea outputText) {
        outputText.append("Teacher ID:"+teacherActor.getTeacherId()+"\r\n");
        outputText.append("Teacher Courses:"+teacherActor.getCourses().size()+"\r\n");

        Iterator<Course> courseListIterator = teacherActor.getCourses().iterator();
        while(courseListIterator.hasNext()){
            outputText.append(courseListIterator.next().toString()+"\r\n");
        }
       
    }
    
    @Override
    public Integer addTeachers(String teacherName, ArrayList<Integer> teacherCourses) {
        Student newTeacher = new Student();
        newTeacher.setName(teacherName);
        teacherPersistor.addTeacher(newTeacher);
        
        Iterator<Integer> teacherCourseIterator = teacherCourses.iterator();
        while(teacherCourseIterator.hasNext()){
            teacherPersistor.addCourse(newTeacher, teacherCourseIterator.next());
        }
        return newTeacher.getStudentId();
    }
    
}
